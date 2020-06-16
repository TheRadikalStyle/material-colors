/*
 * Author: David Ochoa
 * Source: https://github.com/TheRadikalStyle
 * 
 * Material Colors for Java Projects
 * Using pallete from www.materialpalette.com/colors
 * 
 * */

import java.awt.Color;

public class Colors {
	private static Colors colorInstance;
	
	public Color white, black;
	
	public Color materialBlueGray50, materialBlueGray100, materialBlueGray200,
		materialBlueGray300, materialBlueGray400, materialBlueGray500,
			materialBlueGray600 ,materialBlueGray700, materialBlueGray800, materialBlueGray900;
	
	public Color materialGray50, materialGray100, materialGray200,
		materialGray300, materialGray400, materialGray500, materialGray600,
			materialGray700, materialGray800, materialGray900;
	
	public Color materialBrown50, materialBrown100, materialBrown200, 
		materialBrown300, materialBrown400, materialBrown500, 
			materialBrown600, materialBrown700, materialBrown800, materialBrown900;
	
	public Color materialDeepOrange50, materialDeepOrange100, materialDeepOrange200,
		materialDeepOrange300, materialDeepOrange400, materialDeepOrange500, materialDeepOrange600,
			materialDeepOrange700, materialDeepOrange800, materialDeepOrange900, materialDeepOrangeA100,
				materialDeepOrangeA200, materialDeepOrangeA400, materialDeepOrangeA700;
	
	public Color materialOrange50, materialOrange100, materialOrange200,
		materialOrange300, materialOrange400, materialOrange500, materialOrange600,
			materialOrange700, materialOrange800,materialOrange900, materialOrangeA100,
				materialOrangeA200, materialOrangeA400, materialOrangeA700;
	
	public Color materialAmber50, materialAmber100, materialAmber200,
	materialAmber300, materialAmber400, materialAmber500, materialAmber600,
		materialAmber700, materialAmber800,materialAmber900, materialAmberA100,
			materialAmberA200, materialAmberA400, materialAmberA700;
	
	public Color materialYellow50, materialYellow100, materialYellow200,
	materialYellow300, materialYellow400, materialYellow500, materialYellow600,
		materialYellow700, materialYellow800,materialYellow900, materialYellowA100,
			materialYellowA200, materialYellowA400, materialYellowA700;
	
	public Color materialLime50, materialLime100, materialLime200,
	materialLime300, materialLime400, materialLime500, materialLime600,
		materialLime700, materialLime800,materialLime900, materialLimeA100,
			materialLimeA200, materialLimeA400, materialLimeA700;
	
	public Color materialLightGreen50, materialLightGreen100, materialLightGreen200,
	materialLightGreen300, materialLightGreen400, materialLightGreen500, materialLightGreen600,
		materialLightGreen700, materialLightGreen800,materialLightGreen900, materialLightGreenA100,
			materialLightGreenA200, materialLightGreenA400, materialLightGreenA700;
	
	public Color materialGreen50, materialGreen100, materialGreen200,
	materialGreen300, materialGreen400, materialGreen500, materialGreen600,
		materialGreen700, materialGreen800,materialGreen900, materialGreenA100,
			materialGreenA200, materialGreenA400, materialGreenA700;
	
	public Color materialTeal50, materialTeal100, materialTeal200,
	materialTeal300, materialTeal400, materialTeal500, materialTeal600,
		materialTeal700, materialTeal800,materialTeal900, materialTealA100,
			materialTealA200, materialTealA400, materialTealA700;
	
	public Color materialCyan50, materialCyan100, materialCyan200,
	materialCyan300, materialCyan400, materialCyan500, materialCyan600,
		materialCyan700, materialCyan800,materialCyan900, materialCyanA100,
			materialCyanA200, materialCyanA400, materialCyanA700;
	
	public Color materialLightBlue50, materialLightBlue100, materialLightBlue200,
	materialLightBlue300, materialLightBlue400, materialLightBlue500, materialLightBlue600,
		materialLightBlue700, materialLightBlue800,materialLightBlue900, materialLightBlueA100,
			materialLightBlueA200, materialLightBlueA400, materialLightBlueA700;
	
	public Color materialBlue50, materialBlue100, materialBlue200,
	materialBlue300, materialBlue400, materialBlue500, materialBlue600,
		materialBlue700, materialBlue800,materialBlue900, materialBlueA100,
			materialBlueA200, materialBlueA400, materialBlueA700;
		
	
	
	public Color materialIndigo50, materialIndigo100, materialIndigo200,
	materialIndigo300, materialIndigo400, materialIndigo500, materialIndigo600,
		materialIndigo700, materialIndigo800,materialIndigo900, materialIndigoA100,
			materialIndigoA200, materialIndigoA400, materialIndigoA700;
	
	public Color materialDeepPurple50, materialDeepPurple100, materialDeepPurple200,
	materialDeepPurple300, materialDeepPurple400, materialDeepPurple500, materialDeepPurple600,
		materialDeepPurple700, materialDeepPurple800,materialDeepPurple900, materialDeepPurpleA100,
			materialDeepPurpleA200, materialDeepPurpleA400, materialDeepPurpleA700;
	
	public Color materialPurple50, materialPurple100, materialPurple200,
	materialPurple300, materialPurple400, materialPurple500, materialPurple600,
		materialPurple700, materialPurple800,materialPurple900, materialPurpleA100,
			materialPurpleA200, materialPurpleA400, materialPurpleA700;
	
	public Color materialPink50, materialPink100, materialPink200,
	materialPink300, materialPink400, materialPink500, materialPink600,
		materialPink700, materialPink800,materialPink900, materialPinkA100,
			materialPinkA200, materialPinkA400, materialPinkA700;
	
	public Color materialRed50, materialRed100, materialRed200,
	materialRed300, materialRed400, materialRed500, materialRed600,
		materialRed700, materialRed800,materialRed900, materialRedA100,
			materialRedA200, materialRedA400, materialRedA700;
	

	
	Colors() {
		white = Color.decode("#ffffff");
		black = Color.decode("#000000");
		
		//Material Blue Gray
		materialBlueGray50 = Color.decode("#eceff1");
		materialBlueGray100 = Color.decode("#cfd8dc");
		materialBlueGray200 = Color.decode("#b0bec5");
		materialBlueGray300 = Color.decode("#90a4ae");
		materialBlueGray400 = Color.decode("#78909c");
		materialBlueGray500 = Color.decode("#607d8b");
		materialBlueGray600 = Color.decode("#546e7a");
		materialBlueGray700 = Color.decode("#455a64");
		materialBlueGray800 = Color.decode("#37474f");
		materialBlueGray900 = Color.decode("#263238");
		//Material Gray
		materialGray50 = Color.decode("#fafafa");
		materialGray100 = Color.decode("#f5f5f5");
		materialGray200 = Color.decode("#eeeeee");
		materialGray300 = Color.decode("#e0e0e0");
		materialGray400 = Color.decode("#bdbdbd");
		materialGray500 = Color.decode("#9e9e9e");
		materialGray600 = Color.decode("#757575");
		materialGray700 = Color.decode("#616161");
		materialGray800 = Color.decode("#424242");
		materialGray900 = Color.decode("#212121");
		//Material Brown
		materialBrown50 = Color.decode("#efebe9");
		materialBrown100 = Color.decode("#d7ccc8");
		materialBrown200 = Color.decode("#bcaaa4");
		materialBrown300 = Color.decode("#a1887f");
		materialBrown400 = Color.decode("#8d6e63");
		materialBrown500 = Color.decode("#795548");
		materialBrown600 = Color.decode("#6d4c41");
		materialBrown700 = Color.decode("#5d4037");
		materialBrown800 = Color.decode("#4e342e");
		materialBrown900 = Color.decode("#3e2723");
		//Material Deep Orange
		materialDeepOrange50 = Color.decode("#fbe9e7");
		materialDeepOrange100 = Color.decode("#ffccbc");
		materialDeepOrange200 = Color.decode("#ffab91");
		materialDeepOrange300 = Color.decode("#ff8a65");
		materialDeepOrange400 = Color.decode("#ff7043");
		materialDeepOrange500 = Color.decode("#ff5722");
		materialDeepOrange600 = Color.decode("#f4511e");
		materialDeepOrange700 = Color.decode("#e64a19");
		materialDeepOrange800 = Color.decode("#d84315");
		materialDeepOrange900 = Color.decode("#bf360c");
		materialDeepOrangeA100 = Color.decode("#ff9e80");
		materialDeepOrangeA200 = Color.decode("#ff6e40");
		materialDeepOrangeA400 = Color.decode("#ff3d00");
		materialDeepOrangeA700 = Color.decode("#dd2c00");
		//Material Orange
		materialOrange50 = Color.decode("#fff3e0");
		materialOrange100 = Color.decode("#ffe0b2");
		materialOrange200 = Color.decode("#ffcc80");
		materialOrange300 = Color.decode("#ffb74d");
		materialOrange400 = Color.decode("#ffa726");
		materialOrange500 = Color.decode("#ff9800");
		materialOrange600 = Color.decode("#fb8c00");
		materialOrange700 = Color.decode("#f57c00");
		materialOrange800 = Color.decode("#ef6c00");
		materialOrange900 = Color.decode("#e65100");
		materialOrangeA100 = Color.decode("#ffd180");
		materialOrangeA200 = Color.decode("#ffab40");
		materialOrangeA400 = Color.decode("#ff9100");
		materialOrangeA700 = Color.decode("#ff6d00");
		//Material Amber
		materialAmber50 = Color.decode("#fff8e1");
		materialAmber100 = Color.decode("#ffecb3");
		materialAmber200 = Color.decode("#ffe082");
		materialAmber300 = Color.decode("#ffd54f");
		materialAmber400 = Color.decode("#ffca28");
		materialAmber500 = Color.decode("#ffc107");
		materialAmber600 = Color.decode("#ffb300");
		materialAmber700 = Color.decode("#ffa000");
		materialAmber800 = Color.decode("#ff8f00");
		materialAmber900 = Color.decode("#ff6f00");
		materialAmberA100 = Color.decode("#ffe57f");
		materialAmberA200 = Color.decode("#ffd740");
		materialAmberA400 = Color.decode("#ffc400");
		materialAmberA700 = Color.decode("#ffab00");
		//Material Yellow
		materialYellow50 = Color.decode("#fffde7");
		materialYellow100 = Color.decode("#fff9c4");
		materialYellow200 = Color.decode("#fff59d");
		materialYellow300 = Color.decode("#fff176");
		materialYellow400 = Color.decode("#ffee58");
		materialYellow500 = Color.decode("#ffeb3b");
		materialYellow600 = Color.decode("#fdd835");
		materialYellow700 = Color.decode("#fbc02d");
		materialYellow800 = Color.decode("#f9a825");
		materialYellow900 = Color.decode("#f57f17");
		materialYellowA100 = Color.decode("#ffff8d");
		materialYellowA200 = Color.decode("#ffff00");
		materialYellowA400 = Color.decode("#ffea00");
		materialYellowA700 = Color.decode("#ffd600");
		//Material Lime
		materialLime50 = Color.decode("#f9fbe7");
		materialLime100 = Color.decode("#f0f4c3");
		materialLime200 = Color.decode("#e6ee9c");
		materialLime300 = Color.decode("#dce775");
		materialLime400 = Color.decode("#d4e157");
		materialLime500 = Color.decode("#cddc39");
		materialLime600 = Color.decode("#c0ca33");
		materialLime700 = Color.decode("#afb42b");
		materialLime800 = Color.decode("#9e9d24");
		materialLime900 = Color.decode("#827717");
		materialLimeA100 = Color.decode("#f4ff81");
		materialLimeA200 = Color.decode("#eeff41");
		materialLimeA400 = Color.decode("#c6ff00");
		materialLimeA700 = Color.decode("#aeea00");
		//Material LightGreen
		materialLightGreen50 = Color.decode("#f1f8e9");
		materialLightGreen100 = Color.decode("#dcedc8");
		materialLightGreen200 = Color.decode("#c5e1a5");
		materialLightGreen300 = Color.decode("#aed581");
		materialLightGreen400 = Color.decode("#9ccc65");
		materialLightGreen500 = Color.decode("#8bc34a");
		materialLightGreen600 = Color.decode("#7cb342");
		materialLightGreen700 = Color.decode("#689f38");
		materialLightGreen800 = Color.decode("#558b2f");
		materialLightGreen900 = Color.decode("#33691e");
		materialLightGreenA100 = Color.decode("#ccff90");
		materialLightGreenA200 = Color.decode("#b2ff59");
		materialLightGreenA400 = Color.decode("#76ff03");
		materialLightGreenA700 = Color.decode("#64dd17");
		//Material Green
		materialGreen50 = Color.decode("#e8f5e9");
		materialGreen100 = Color.decode("#c8e6c9");
		materialGreen200 = Color.decode("#a5d6a7");
		materialGreen300 = Color.decode("#81c784");
		materialGreen400 = Color.decode("#66bb6a");
		materialGreen500 = Color.decode("#4caf50");
		materialGreen600 = Color.decode("#43a047");
		materialGreen700 = Color.decode("#388e3c");
		materialGreen800 = Color.decode("#2e7d32");
		materialGreen900 = Color.decode("#1b5e20");
		materialGreenA100 = Color.decode("#b9f6ca");
		materialGreenA200 = Color.decode("#69f0ae");
		materialGreenA400 = Color.decode("#00e676");
		materialGreenA700 = Color.decode("#00c853");
		//Material Teal
		materialTeal50 = Color.decode("#e0f2f1");
		materialTeal100 = Color.decode("#b2dfdb");
		materialTeal200 = Color.decode("#80cbc4");
		materialTeal300 = Color.decode("#4db6ac");
		materialTeal400 = Color.decode("#26a69a");
		materialTeal500 = Color.decode("#009688");
		materialTeal600 = Color.decode("#00897b");
		materialTeal700 = Color.decode("#00796b");
		materialTeal800 = Color.decode("#00695c");
		materialTeal900 = Color.decode("#004d40");
		materialTealA100 = Color.decode("#a7ffeb");
		materialTealA200 = Color.decode("#64ffda");
		materialTealA400 = Color.decode("#1de9b6");
		materialTealA700 = Color.decode("#00bfa5");
		//Material Cyan
		materialCyan50 = Color.decode("#e0f7fa");
		materialCyan100 = Color.decode("#b2ebf2");
		materialCyan200 = Color.decode("#80deea");
		materialCyan300 = Color.decode("#4dd0e1");
		materialCyan400 = Color.decode("#26c6da");
		materialCyan500 = Color.decode("#00bcd4");
		materialCyan600 = Color.decode("#00acc1");
		materialCyan700 = Color.decode("#0097a7");
		materialCyan800 = Color.decode("#00838f");
		materialCyan900 = Color.decode("#006064");
		materialCyanA100 = Color.decode("#84ffff");
		materialCyanA200 = Color.decode("#18ffff");
		materialCyanA400 = Color.decode("#00e5ff");
		materialCyanA700 = Color.decode("#00b8d4");
		//Material LightBlue
		materialLightBlue50 = Color.decode("#e1f5fe");
		materialLightBlue100 = Color.decode("#b3e5fc");
		materialLightBlue200 = Color.decode("#81d4fa");
		materialLightBlue300 = Color.decode("#4fc3f7");
		materialLightBlue400 = Color.decode("#29b6f6");
		materialLightBlue500 = Color.decode("#03a9f4");
		materialLightBlue600 = Color.decode("#039be5");
		materialLightBlue700 = Color.decode("#0288d1");
		materialLightBlue800 = Color.decode("#0277bd");
		materialLightBlue900 = Color.decode("#01579b");
		materialLightBlueA100 = Color.decode("#80d8ff");
		materialLightBlueA200 = Color.decode("#40c4ff");
		materialLightBlueA400 = Color.decode("#00b0ff");
		materialLightBlueA700 = Color.decode("#0091ea");
		//Material Blue
		materialBlue50 = Color.decode("#e3f2fd");
		materialBlue100 = Color.decode("#bbdefb");
		materialBlue200 = Color.decode("#90caf9");
		materialBlue300 = Color.decode("#64b5f6");
		materialBlue400 = Color.decode("#42a5f5");
		materialBlue500 = Color.decode("#2196f3");
		materialBlue600 = Color.decode("#1e88e5");
		materialBlue700 = Color.decode("#1976d2");
		materialBlue800 = Color.decode("#1565c0");
		materialBlue900 = Color.decode("#0d47a1");
		materialBlueA100 = Color.decode("#82b1ff");
		materialBlueA200 = Color.decode("#448aff");
		materialBlueA400 = Color.decode("#2979ff");
		materialBlueA700 = Color.decode("#2962ff");
		//Material Indigo
		materialIndigo50 = Color.decode("#e8eaf6");
		materialIndigo100 = Color.decode("#c5cae9");
		materialIndigo200 = Color.decode("#9fa8da");
		materialIndigo300 = Color.decode("#7986cb");
		materialIndigo400 = Color.decode("#5c6bc0");
		materialIndigo500 = Color.decode("#3f51b5");
		materialIndigo600 = Color.decode("#3949ab");
		materialIndigo700 = Color.decode("#303f9f");
		materialIndigo800 = Color.decode("#283593");
		materialIndigo900 = Color.decode("#1a237e");
		materialIndigoA100 = Color.decode("#8c9eff");
		materialIndigoA200 = Color.decode("#536dfe");
		materialIndigoA400 = Color.decode("#3d5afe");
		materialIndigoA700 = Color.decode("#304ffe");
		//Material DeepPurple
		materialDeepPurple50 = Color.decode("#ede7f6");
		materialDeepPurple100 = Color.decode("#d1c4e9");
		materialDeepPurple200 = Color.decode("#b39ddb");
		materialDeepPurple300 = Color.decode("#9575cd");
		materialDeepPurple400 = Color.decode("#7e57c2");
		materialDeepPurple500 = Color.decode("#673ab7");
		materialDeepPurple600 = Color.decode("#5e35b1");
		materialDeepPurple700 = Color.decode("#512da8");
		materialDeepPurple800 = Color.decode("#4527a0");
		materialDeepPurple900 = Color.decode("#311b92");
		materialDeepPurpleA100 = Color.decode("#b388ff");
		materialDeepPurpleA200 = Color.decode("#7c4dff");
		materialDeepPurpleA400 = Color.decode("#651fff");
		materialDeepPurpleA700 = Color.decode("#6200ea");
		//Material Purple
		materialPurple50 = Color.decode("#f3e5f5");
		materialPurple100 = Color.decode("#e1bee7");
		materialPurple200 = Color.decode("#ce93d8");
		materialPurple300 = Color.decode("#ba68c8");
		materialPurple400 = Color.decode("#ab47bc");
		materialPurple500 = Color.decode("#9c27b0");
		materialPurple600 = Color.decode("#8e24aa");
		materialPurple700 = Color.decode("#7b1fa2");
		materialPurple800 = Color.decode("#6a1b9a");
		materialPurple900 = Color.decode("#4a148c");
		materialPurpleA100 = Color.decode("#ea80fc");
		materialPurpleA200 = Color.decode("#e040fb");
		materialPurpleA400 = Color.decode("#d500f9");
		materialPurpleA700 = Color.decode("#aa00ff");
		//Material Pink
		materialPink50 = Color.decode("#fce4ec");
		materialPink100 = Color.decode("#f8bbd0");
		materialPink200 = Color.decode("#f48fb1");
		materialPink300 = Color.decode("#f06292");
		materialPink400 = Color.decode("#ec407a");
		materialPink500 = Color.decode("#e91e63");
		materialPink600 = Color.decode("#d81b60");
		materialPink700 = Color.decode("#c2185b");
		materialPink800 = Color.decode("#ad1457");
		materialPink900 = Color.decode("#880e4f");
		materialPinkA100 = Color.decode("#ff80ab");
		materialPinkA200 = Color.decode("#ff4081");
		materialPinkA400 = Color.decode("#f50057");
		materialPinkA700 = Color.decode("#c51162");
		//Material Red
		materialRed50 = Color.decode("#ffebee");
		materialRed100 = Color.decode("#ffcdd2");
		materialRed200 = Color.decode("#ef9a9a");
		materialRed300 = Color.decode("#e57373");
		materialRed400 = Color.decode("#ef5350");
		materialRed500 = Color.decode("#f44336");
		materialRed600 = Color.decode("#e53935");
		materialRed700 = Color.decode("#d32f2f");
		materialRed800 = Color.decode("#c62828");
		materialRed900 = Color.decode("#b71c1c");
		materialRedA100 = Color.decode("#ff8a80");
		materialRedA200 = Color.decode("#ff5252");
		materialRedA400 = Color.decode("#ff1744");
		materialRedA700 = Color.decode("#d50000");
		
	}
	
	public static Colors getInstance() {
		if(colorInstance == null)
			colorInstance = new Colors();
		
		return colorInstance;
	}
}
