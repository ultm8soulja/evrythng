#Grand Piano as "Internet of Things" enabled device

A Grand Piano is a stringed instrument and as such is susceptible to fluctuations in its tuning, induced by climate and playing.
Keeping the piano regularly tuned is important in sustaining the life of the strings, as long periods without servicing can result in permanent deformation of strings.
Grand Pianos are generally tuned 4 times a year, perhaps at the beginning/end of each season (assuming the country of residence has such climate).
Regular players are encouraged to tune a minimum of 4 times a year by an expert tuner.
An owner would generally have a tuner that they regularly employ. The majority of piano players are not Pitch Perfect and thus wouldn't generally know when their instrument is beginning to fluctuate.

If a Grand Piano were an "Internet of Things" enabled device, able to communicate data with some access point, then it could contain sensory devices that help detect fluctuations in pitch, thus prompting the owner more accurately when to get their instrument tuned.
* Sensory devices:
	* Acoustic sensor(s): could be used to capture the pitch of strings in a region of the piano, allowing an on-board tuner-like device to analyse and determine the pitch accuracy of a string. Several of these sensors could be placed in the piano, perhaps one per octave, allowing the intensity of the captured waveform to be used in differentiating specific octave regions. This would be helpful if a string in a certain octave has reduced in pitch to such a degree that is falls into a similar pitch in a higher/lower octave (Improbable but possible - more likely when moving the instrument or when it is not played for a long time). Such data could also be useful in understanding the acoustic dynamics of the instrument in reference to its physical dimensions and curvature (Personification of the instrument - its character).
	* Temperature sensor, perhaps a Thermocouple: could be used to capture the temperature within the body of the instrument, which would aid in determining the effects of temperature on pitch fluctuation in respect to how often to tune the piano. This would be additionally useful in understanding whether geographical temperature or room temperature (heating) is responsible.
	* IR sensor: The majority of Grand Pianos don't have electrical components thus no power source. Any integrated electrical components (embedded computer, wireless network card, sensors) would require a power source. It would be advantageous if some of these components were not permanently on in order to conserve power and elongate their lifespan. The inclusion of an IR sensor (transmitter and receiver) positioned in a location in line with mechanical motion (striking of keys) could be used to trip a circuit and activate full power mode while the instrument is in use.

By profiling data acquired from such sensory devices, it could be used to accurately dictate when the piano requires tuning and what region/string specifically is out of tune, as well as gaining a better understanding of the instrument. Who knows, maybe the data can be used as part of some sell-on document providing a new owner info on how the device has been used and cared for in the past.

I will model the piano and proposed data that could be collected via integrated sensors.

The following properties could be useful:
* Profile of the instrument (manufacturer, model, dimensions, etc.)
* Number of keys struck (per day)
* Temperature of device (twice a day)
* Identity of a struck key, as well as its deviation (if any) from the expected pitch


Start point [here] (https://github.com/ultm8soulja/evrythng/blob/master/src/main/java/co/uk/softwaredojo/evrythng/evrythngapidemo/PianoExample.java)
