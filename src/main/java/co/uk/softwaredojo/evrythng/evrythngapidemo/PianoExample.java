package co.uk.softwaredojo.evrythng.evrythngapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.evrythng.java.wrapper.ApiManager;
import com.evrythng.java.wrapper.core.ExampleRunner;
import com.evrythng.java.wrapper.exception.EvrythngClientException;
import com.evrythng.java.wrapper.exception.EvrythngException;
import com.evrythng.java.wrapper.service.ProductService;
import com.evrythng.java.wrapper.service.ThngService;
import com.evrythng.thng.commons.config.ApiConfiguration;
import com.evrythng.thng.resource.model.store.Location;
import com.evrythng.thng.resource.model.store.Product;
import com.evrythng.thng.resource.model.store.Property;
import com.evrythng.thng.resource.model.store.Thng;

public class PianoExample extends ExampleRunner {
	
	private ApiManager apiManager;
	private ThngService thngService;
	private ProductService productService;
	
	private String PIANO_THNG_NAME = "Colina-D-274";
	private String PIANO_PRODUCT_FN = "D-274";

	public PianoExample(ApiConfiguration config) {
		super(config);
	}

	@Override
	protected void doRun() throws EvrythngException {
		// Initialize the API Manager:
		echo("Initializing the ApiManager: [config={}]", getConfig());
		apiManager = new ApiManager(getConfig());

		// Let's create a product using the ProductService:
		echo("Retrieving the Product API service...");
		productService = apiManager.productService();

		// Let's create a thng using the ProductService:
		echo("Retrieving the Thng API service...");
		thngService = apiManager.thngService();
		
		//Create Piano Product
		String productId = createPianoProduct();
		echo(productId);
		
		//Create instance of product (a Thng)
		Thng piano = createPianoThng(PIANO_THNG_NAME, productId);
		
		//Store test sensory data for piano (striking Middle C 107 times)
		List<Property> pianoProperties = new ArrayList<>();
		pianoProperties.add(new Property("NumberOfKeysStruck", "107"));
		pianoProperties.add(new Property("Temperature", "18"));
		pianoProperties.add(new Property(PianoKeyEnum.KEY40.getName(), "261.634"));
		
		thngService.propertiesCreator(piano.getId(), pianoProperties).execute();
	}
	
	public Thng createPianoThng(String thngName, String productId) throws EvrythngClientException, EvrythngException {
		//first check if piano product already exists
		Thng piano = checkPianoExists(thngName);
		if(piano != null) return piano;
		
		piano = new Thng();
		piano.setName(PIANO_THNG_NAME);
		piano.setDescription("Colin Agbabiaka's modded Steinway D-274 - 'Internet of Things' enabled");
		Location pianoLocation = new Location();
		pianoLocation.setLongitude(-0.03872);
		pianoLocation.setLatitude(51.51030);
		piano.setLocation(pianoLocation);
		piano.setProduct(productId);
		
		Thng out = thngService.thngCreator(piano).execute();
		return out;
	}
	
	public Thng checkPianoExists(String name) throws EvrythngClientException, EvrythngException {
		List<Thng> thngs = thngService.thngsReader().execute();
		
		for(Thng thng : thngs) {
			if(thng.getName().equals(name)) return thng;
		}
		return null;
	}
	
	public String checkPianoProductExists(String fn) throws EvrythngClientException, EvrythngException {
		List<Product> products = productService.productsReader().execute();
		
		for(Product product : products) {
			if(product.getFn().equals(fn)) return product.getId();
		}
		return null;
	}
	
	public String createPianoProduct() throws EvrythngException {
		//first check if piano product already exists
		String productId = checkPianoProductExists(PIANO_PRODUCT_FN);
		if(productId != null) return productId;
		
		//create the piano
		echo("Creating Piano as Product");
		Product pianoProduct = new Product();
		pianoProduct.setFn(PIANO_PRODUCT_FN);
		pianoProduct.setDescription("Concert Grand Piano");
		pianoProduct.setBrand("Steinway");
		pianoProduct.setCategories(Arrays.asList("Piano"));
		pianoProduct.setPhotos(Arrays.asList("http://www.steinway.com/images/piano-model/model-d-ny.png"));
		pianoProduct.setUrl("http://www.steinway.com/pianos/steinway/grand/model-d/");
		pianoProduct.setTags(Arrays.asList("Piano", "Grand Piano", "Instrument", "Music", "Steinway & Sons"));
		Map<String, String> pianoIdentifiers = new HashMap<>();
		pianoIdentifiers.put("ModelId", PIANO_PRODUCT_FN);
		pianoIdentifiers.put("Class", "D");
		Map<String, String> pianoProperties = new HashMap<>();
		
		//additional properties
		pianoProperties.put("length", "274cm");
		pianoProperties.put("width", "156cm");
		pianoProperties.put("weight", "274kg");
		
		Product out = productService.productCreator(pianoProduct).execute();
		return out.getId();
	}

	public static void main(String[] args) throws EvrythngException {
		ApiConfiguration config = new ApiConfiguration("kg9ujGSLGt3sZ5ZQMH6ZyDJVfPTiXvQPZMiLBFeYEhhkXs99JwEhzYQuDAiMu6nl3CjuzFxdxw5y3HeN");

		PianoExample example = new PianoExample(config);
		example.run();

		System.exit(0);
	}
}
