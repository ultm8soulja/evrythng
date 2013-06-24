package co.uk.softwaredojo.evrythng.evrythngapidemo;

public enum PianoKeyEnum {
	KEY88(88, "C8 Eighth octave", 4186.01),
	KEY87(87, "B7", 3951.07),
	KEY86(86, "A♯7/B♭7", 3729.31),
	KEY85(85, "A7", 3520),
	KEY84(84, "G♯7/A♭7", 3322.44),
	KEY83(83, "G7", 3135.96),
	KEY82(82, "F♯7/G♭7", 2959.96),
	KEY81(81, "F7", 2793.83),
	KEY80(80, "E7", 2637.02),
	KEY79(79, "D♯7/E♭7", 2489.02),
	KEY78(78, "D7", 2349.32),
	KEY77(77, "C♯7/D♭7", 2217.46),
	KEY76(76, "C7 Double high C", 2093),
	KEY75(75, "B6", 1975.53),
	KEY74(74, "A♯6/B♭6", 1864.66),
	KEY73(73, "A6", 1760),
	KEY72(72, "G♯6/A♭6", 1661.22),
	KEY71(71, "G6", 1567.98),
	KEY70(70, "F♯6/G♭6", 1479.98),
	KEY69(69, "F6", 1396.91),
	KEY68(68, "E6", 1318.51),
	KEY67(67, "D♯6/E♭6", 1244.51),
	KEY66(66, "D6", 1174.66),
	KEY65(65, "C♯6/D♭6", 1108.73),
	KEY64(64, "C6 Soprano C (High C),", 1046.5),
	KEY63(63, "B5", 987.767),
	KEY62(62, "A♯5/B♭5", 932.328),
	KEY61(61, "A5", 880),
	KEY60(60, "G♯5/A♭5", 830.609),
	KEY59(59, "G5", 783.991),
	KEY58(58, "F♯5/G♭5", 739.989),
	KEY57(57, "F5", 698.456),
	KEY56(56, "E5", 659.255),
	KEY55(55, "D♯5/E♭5", 622.254),
	KEY54(54, "D5", 587.33),
	KEY53(53, "C♯5/D♭5", 554.365),
	KEY52(52, "C5 Tenor C", 523.251),
	KEY51(51, "B4", 493.883),
	KEY50(50, "A♯4/B♭4", 466.164),
	KEY49(49, "A4 A440", 440),
	KEY48(48, "G♯4/A♭4", 415.305),
	KEY47(47, "G4", 391.995),
	KEY46(46, "F♯4/G♭4", 369.994),
	KEY45(45, "F4", 349.228),
	KEY44(44, "E4", 329.628),
	KEY43(43, "D♯4/E♭4", 311.127),
	KEY42(42, "D4", 293.665),
	KEY41(41, "C♯4/D♭4", 277.183),
	KEY40(40, "C4 Middle C", 261.626),
	KEY39(39, "B3", 246.942),
	KEY38(38, "A♯3/B♭3", 233.082),
	KEY37(37, "A3", 220),
	KEY36(36, "G♯3/A♭3", 207.652),
	KEY35(35, "G3", 195.998),
	KEY34(34, "F♯3/G♭3", 184.997),
	KEY33(33, "F3", 174.614),
	KEY32(32, "E3", 164.814),
	KEY31(31, "D♯3/E♭3", 155.563),
	KEY30(30, "D3", 146.832),
	KEY29(29, "C♯3/D♭3", 138.591),
	KEY28(28, "C3 Low C", 130.813),
	KEY27(27, "B2", 123.471),
	KEY26(26, "A♯2/B♭2", 116.541),
	KEY25(25, "A2", 110),
	KEY24(24, "G♯2/A♭2", 103.826),
	KEY23(23, "G2", 97.9989),
	KEY22(22, "F♯2/G♭2", 92.4986),
	KEY21(21, "F2", 87.3071),
	KEY20(20, "E2", 82.4069),
	KEY19(19, "D♯2/E♭2", 77.7817),
	KEY18(18, "D2", 73.4162),
	KEY17(17, "C♯2/D♭2", 69.2957),
	KEY16(16, "C2 Deep C", 65.4064),
	KEY15(15, "B1", 61.7354),
	KEY14(14, "A♯1/B♭1", 58.2705),
	KEY13(13, "A1", 55),
	KEY12(12, "G♯1/A♭1", 51.9131),
	KEY11(11, "G1", 48.9994),
	KEY10(10, "F♯1/G♭1", 46.2493),
	KEY9(9, "F1", 43.6535),
	KEY8(8, "E1", 41.2034),
	KEY7(7, "D♯1/E♭1", 38.8909),
	KEY6(6, "D1", 36.7081),
	KEY5(5, "C♯1/D♭1", 34.6478),
	KEY4(4, "C1 Pedal C", 32.7032),
	KEY3(3, "B0", 30.8677),
	KEY2(2, "A♯0/B♭0", 29.1352),
	KEY1(1, "A0 Double Pedal A", 27.5);
	
	private int keyNumber;
	private String name;
	private double frequency;
	
	private PianoKeyEnum(int keyNumber, String name, double frequency) {
		this.keyNumber = keyNumber;
		this.name = name;
		this.frequency = frequency;
	}

	public int getKeyNumber() {
		return keyNumber;
	}

	public String getName() {
		return name;
	}

	public double getFrequency() {
		return frequency;
	}
}
