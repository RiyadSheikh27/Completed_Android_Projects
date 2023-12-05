
package com.riyadtech.cartoontube;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("t0Q2otsqC4I", "Tom & Jerry | Tom with the little kid | Episode 01 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("uG-zsKSQyDk", "Tom & Jerry | Happy Cheese Day | Episode 02 | ", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("5oH9Nr3bKfw", "Tom & Jerry | Tom & Jerry thrive outside | Episode 03 |", " Enjoy this compilation with the best moments in the fresh air | Tom & Jerry. ");
		addVideoItem("AGBjI0x9VbM", "Tom & Jerry | Jerry keep little Quacker out of trouble | Episode 04 |", "Quack! Jerry is always around to help keep Little Quacker out of trouble ,especially from Tom.");
		addVideoItem("7fcP64w7eBE", "Tom & Jerry | Jerry becomes Ma-Ma | Episode 05 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("nMqaLDL_YUc", "Tom & Jerry | Jerry protects the frog from Tom | Episode 06 | ", "Tom chases down a frog but Jerry protects it.Really funny.");
		addVideoItem("ihI_GYHjs2c", "Tom & Jerry | Summer vacation of Tom and Jerry | Episode 07 |", "Summer is almost here, so let's take a look at Tom and Jerry's favourite summer activities.");
		addVideoItem("NcTNyJEk6LY", "Tom & Jerry | It's the Tom and Jerry Mummy episode | Episode 08 |", "Tom and Jerry find a treasure deep down in a pyramid tomb.");
		addVideoItem("hGbnETXfllM", "Tom & Jerry | Tom and Jerry often crave the fresh air | Episode 09 |", "What can they do outside that might involve food?");
		addVideoItem("k9nKJcSz6Kk", "Tom & Jerry | The Egg War between Tom and Jerry | Episode 10 | ", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("YTDHcEJs684", "Tom & Jerry | Poor Tom and hin tick problem | Episode 11 |", " Jerry doesn't hesitate to use it against Tom. Poor Tom! ");
		addVideoItem("NsqjAA6Tk-Q", "Tom & Jerry | Adventurous tour in the weekend of Tom & Jerry | Episode 12 |", "There is nothing better than going on a little adventure during the weekend! ");
		addVideoItem("3olM-9vcd4M", "Tom & Jerry | The learning leasson of Tom & Jerry | Episode 13 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("-qagpwPP-VU", "Tom & Jerry | What a Fine Evening! | Episode 14 | ", "You can enjoy Tom & Jerry at any time you want, but sometimes they do enjoy a little adventure in the evening!");
		addVideoItem("QM2-MX1Lz-A", "Tom & Jerry | Tom and Jerry Car Race | Episode 15 |", "Tom and Jerry home destroyed || Tom fight with dog ||");
		addVideoItem("Fu3MIwF-LJw", "Tom & Jerry | A Little Mischief Never Hurt Nobody!| Episode 16 |", "If Tom & Jerry had a motto, it would surely be 'A Little Mischief Never Hurt Nobody!");
		addVideoItem("DRk2UlF70nE", "Tom & Jerry | Thank You for the Food! | Episode 17 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("0uQwp2qn9cQ", "Tom & Jerry | The funiest moment of Tom & Jerry | Episode 18 | ", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("bBlg2zwPyD0", "Tom & Jerry | Tom & Jerry are enjoying their time outdoor | Episode 19 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("IC7kXsnYCWk", "Tom & Jerry | Some good old chasing and pranking | Episode 20 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("Yiv0jAJNna8", "Tom & Jerry | Baby, It's Cold Outside! | Episode 21 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("h_TFfNp_C2c", "Tom & Jerry | Never A Null Day With T&J!  | Episode 22 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("m3JbtiSfeYk", "Tom & Jerry | Best From Detectives Tom and Jerry | Episode 23 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("Eyoq0cJ43Pg", "Tom & Jerry | Tom Gets It | Episode 24 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("CbxaKoxM_Oo", "Tom & Jerry | Water Creatures | Episode 25 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("9JU4aGEJGdU", "Tom & Jerry | Tom Chases Down A Gopher | Episode 26 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("qRKepqgDV_0", "Tom & Jerry | Tom and Jerry, 100 Episode | Episode 27 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("et_F48Z8RDk", "Tom & Jerry | Tom, Jerry And The Goddess Of Flame | Episode 28 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("Wv252Gz3Lx0", "Tom & Jerry | Let's Save the Day!  | Episode 29 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("h5c8nFwtyig", "Tom & Jerry | End of the Year | Episode 30 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("DRk2UlF70nE", "Tom & Jerry | Thank You for the Food! | Episode 31 |", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");
		addVideoItem("-qagpwPP-VU", "Tom & Jerry | What a Fine Evening! | Episode 32 | ", "You can enjoy Tom & Jerry at any time you want, but sometimes they do enjoy a little adventure in the evening!");
		addVideoItem("uG-zsKSQyDk", "Tom & Jerry | Happy Cheese Day | Episode 33 | ", "Enjoy your all classic Tom & Jerry episodes here with a proper serial.");

		createPlayList("Tom & Jerry", R.drawable.tomjerry);
		//==========================================================================

		addVideoItem("g5IpsW508i0", "Chhota Bheem | Shaher mein Tun Tun Mausi | Episode 01 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("0AlvPeS9msw", "Chhota Bheem | Chhota Bheem’s Adventures in Singapore | Episode 02 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("QTbYFk7mZ8o", "Chhota Bheem | Pyase Paudhe Ke Kahani | Episode 03 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("48ZfGtHLWX0", "Chhota Bheem | Hero Adventure | Episode 04 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("Sb7BhgC-sCQ", "Chhota Bheem | Snake King Attack  | Episode 05 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("EzNUvHTj-3I", "Chhota Bheem | Dholakpur Mein Bhoot Trouble  | Episode 06 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("HnsB91ZUgio", "Chhota Bheem | Krishna v/s Zimbara in Sundarban | Episode 07 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("YMBp8YiEriI", "Chhota Bheem | Mighty Little Bheem  | Episode 08 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("OK2f-G4FaaA", "Chhota Bheem | The Princess Challenge | Episode 09 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("3lYcfd3jwno", "Chhota Bheem | Masti Ke Pathshaala | Episode 10 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("iSE6X_MsdWo", "Chhota Bheem | Bheem VS Ustaad - Champion of Dholakpur | Episode 11 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("WZ2kEzhf_88", "Chhota Bheem | A Trip to Taj Mahal  | Episode 12 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("jymJETc3V8c", "Chhota Bheem | Chhota Bheem Title Song | Episode 13 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("72gsNi4ksA0", "Chhota Bheem | Chutki - Mysterious Cave | Episode 14 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("g2fSxs-a8a0", "Chhota Bheem | Chhota Bheem New Year Cake Party in Dholakpur | Episode 15 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("DcGwGPGY0OM", "Chhota Bheem | Moon Trouble | Episode 16 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("4HiAcNCtvW8", "Chhota Bheem | Back to School  | Episode 17 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("ZDtLM9IO3wc", "Chhota Bheem | Dost Bane Dadaji | Episode 18 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("1PcXKyOHygc", "Chhota Bheem | Mama mere Mama | Episode 19 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("OK2f-G4FaaA", "Chhota Bheem | The Princess Challenge | Episode 20 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("64McsQe3PRI", "Chhota Bheem | Christmas Special Video | Episode 21 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("EiY38nXatMg", "Chhota Bheem | Dholakpur Mein Floods | Episode 22 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("92Hs-fUxaGs", "Chhota Bheem | Dholakpur Boat Race Competition | Episode 23 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("DPYLtNi-PwY", "Chhota Bheem | Chutki - The Fort Mystery | Episode 24 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("vEGfMaMyF6Y", "Chhota Bheem | Best Gift to Shivani on Rakshabandhan | Episode 25 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("q8gsIECz3DU", "Chhota Bheem | Asli Bheem Kaun | Episode 26 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("kONgQ941GPo", "Chhota Bheem | Journey to Raunak Nagar  | Episode 27 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("KE5GfeHC_Ns", "Chhota Bheem | Bheem par Hamla | Episode 28 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("lfEgJfncXy4", "Chhota Bheem | Kalia Ustaad VS Jootapur Monster | Episode 29 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("6EOa0o9o7Hg", "Chhota Bheem | Battle of the Bands | Episode 30 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");
		addVideoItem("P4_QJprnUOc", "Chhota Bheem | Mighty Little Bheem FULL EPISODES 17-21 | Episode 31 |", "Enjoy your all classic Chhota Bheem episodes here with a proper serial.");

		createPlayList("Chhota Bheem", R.drawable.chhotabheem);

		//==========================================================================

		addVideoItem("jiiM7B5vCE0", "Doraemon |Doraemon new Hindi episode today |Episode 01 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("q_H4RRL-Cks", "Doraemon |Doraemon new episodes in hindi |Episode 02 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("VBJKGXu2gwk", "Doraemon |Doreamon new episode  |Episode 03 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("3CZvClVEd88", "Doraemon | Suzuka Disappeared |Episode 04 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("m1IE7cxv-Bw", "Doraemon |Doraemon new episode 2018 in hindi in HD |Episode 05 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("9q-TesTU6CM", "Doraemon |Doraemon new episode 2018 in hindi in HD |Episode 06 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("UbDgrSIYW6o", "Doraemon |Doraemon new episode season 16 Episode 52 in Hindi Hd |Episode 07 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("LEZEJ3k1cTQ", "Doraemon |Doraemon Season 5 Episode 52 in Hindi |Episode 08 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("eNlM1FiT6v8", "Doraemon |Doraemon Doraemon my favourite |Episode 09 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("_HOGMAgWLh8", "Doraemon |Doreamon in hindi |Episode 10 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("CHvZ0etQQok", "Doraemon |Doraemon in Hindi Inside Expander Cup  |Episode 11 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("4HPhT-n8I4I", "Doraemon |Doraemon New Episodes in Hindi  |Episode 12 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("tB0IUmC7iI4", "Doraemon |Doraemon new Hindi episode today |Episode 13 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("0sncStGAOkk", "Doraemon |Chopsticks Ka Training 2022 |Episode 14 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("lN_7-l9AD0Y", "Doraemon |Doraemon latest episode |Episode 15 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("GLaduEX-4AA", "Doraemon |Doraemon new episode  |Episode 16 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("CxwJE0miuBY", "Doraemon |Nobita Banega Snail |Episode 17 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("SezZOqVeDZU", "Doraemon |Human Motor Cross Set |Episode 18 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("6xsdO5dRGig", "Doraemon |Servant Stickers |Episode 19 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("vAWIfY5kUlA", "Doraemon |The Birth of Nobita |Episode 20 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("DQC-COOY3_A", "Doraemon |Switching Place Gun Doraemon in Hindi |Episode 21 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("qxPW-UxshlA", "Doraemon |Make a Genie Lamp  |Episode 22 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("2GqMTgQ8jCk", "Doraemon |New Doraemon cartoon in hindi |Episode 23 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("3duIbN6ckBo", "Doraemon |Doraemon new Hindi episode today |Episode 24 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("MnvakYVUTls", "Doraemon |Doraemon new Hindi episode today |Episode 25 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");
		addVideoItem("sO-Wc91rJ-I", "Doraemon |Doraemon In Hindi Nobita Ka Birthday |Episode 26 |", "Enjoy your all classic Doraemon episodes here with a proper serial.");

		createPlayList("Doraemon", R.drawable.doramon);

		//==========================================================================


		addVideoItem("WUOhNFNsaMs", "Oggy and the Cockroaches | SNACK TIME | Episode 01 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("BstW5GDKVMU", "Oggy and the Cockroaches | Sports Fans  | Episode 02 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("Iyg8rGlotZI", "Oggy and the Cockroaches | Oggy's new friend | Episode 03 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("dKw7bdk6hQ8", "Oggy and the Cockroaches | ⛄❄ SNOW TIME ❄⛄ | Episode 04 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("6eOBiS3gnAo", "Oggy and the Cockroaches | THE COIN | Episode 05 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("P_WYV5fNl4g", "Oggy and the Cockroaches | ALONE IN LAKE | Episode 06 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("QxEW1NzE0mM", "Oggy and the Cockroaches | FOOD ONLY  | Episode 07 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("i-uygwed-0k", "Oggy and the Cockroaches | ELEVATOR MANIA | Episode 08 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("WMfbrmup1XU", "Oggy and the Cockroaches | From Mumbai With Love  | Episode 09 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("tf8NV-tUXXY", "Oggy and the Cockroaches | ALL OPENINGS | Episode 10 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("JmB6a6D-N7M", "Oggy and the Cockroaches | Farmer for a Day | Episode 11 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("mJ4L-vQxm_c", "Oggy and the Cockroaches | Now you see me, now you don’t! | Episode 12 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("YLQl-yUSjx8", "Oggy and the Cockroaches | I SEE YOU \uD83D\uDC40 | Episode 13 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("DE3dnYk1haY", "Oggy and the Cockroaches | Friday the 13th | Episode 14 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("JYmcbuv4iRQ", "Oggy and the Cockroaches | The Lighthouse Keeper  | Episode 15 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("NWMVo6c2EHQ", "Oggy and the Cockroaches | TO FIX A CAR  | Episode 16 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("8TWMT4auvHQ", "Oggy and the Cockroaches | VIDEO GAMES IN LIVING ROOM  | Episode 17 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("UV1luTyPOiY", "Oggy and the Cockroaches | \uD83D\uDD25HALLOWEEN\uD83D\uDD25  | Episode 18 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("MUMCZZl9QCY", "Oggy and the Cockroaches | KEYS & IDEAS  | Episode 19 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("5potxuWoYRI", "Oggy and the Cockroaches | DRIVING MY SCOOTER AT NIGHT  | Episode 20 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("5N7Z5aOQq8Q", "Oggy and the Cockroaches | CATCH THEM ALL  | Episode 21 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("x8xdYNoAPJw", "Oggy and the Cockroaches | NEW CAR FOR JACK   | Episode 22 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("PKiiu93YR2Q", "Oggy and the Cockroaches | TWO BAD GUYS   | Episode 23 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("CVWCsRqoKDs", "Oggy and the Cockroaches | MODERN ART IS FUTURE   | Episode 24 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("OR6qP-X5fcs", "Oggy and the Cockroaches | Jack's Nephew  | Episode 25 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("Ll7JN5fvziU", "Oggy and the Cockroaches | A Jealous Guy  | Episode 26 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("s-9eYceu6ZA", "Oggy and the Cockroaches | Globulopolis   | Episode 27 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");
		addVideoItem("dKw7bdk6hQ8", "Oggy and the Cockroaches | Back To The Past!  | Episode 28 |", "Enjoy your all classic oggy and the cockroaches episodes here with a proper serial.");

		createPlayList("Oggy&Cockroaches", R.drawable.oggy);

		//==========================================================================

		addVideoItem("hNBDtBfv6wE", "Ben 10 | Under pressure from Ben's newfound fame | Episode 01 |", "Ben comes up with a plan to be at more than one place at a time.");
		addVideoItem("TU7aW0dSmR8", "Ben 10 | All DNA Scans & Transformations | Episode 02 |", "In today's video, we will have a look at each alien's transformation scene in Ben 10 Alien Force/Ben 10.");
		addVideoItem("0na-zg_IfNg", "Ben 10 | Action collection of Ben | Episode 03 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("Ro-6yK3Culw", "Ben 10 | Amazing part,don't miss | Episode 04 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("mTsoDEzllFU", "Ben 10 | Classical Transformation of ben | Episode 05 |", " Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("JjDuyqr2lZk", "Ben 10 | Ultimate Alien - Duped  | Episode 06 |", "Under pressure from his newfound fame.");
		addVideoItem("kUAp6ar37RA", "Ben 10 | New Ben 10 ultimate Aliens Force transformation | Episode 07 |", "Enjoy your all classic Ben 10 episodes here with a proper serial..");
		addVideoItem("D6GzPE2TZWo", "Ben 10 | Ultimate Alien - Coolest Moments | Episode 08 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("3Pwfqmjp6Rw", "Ben 10 | New Omnitrix | Innervasion: High Override  | Episode 09 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("E6eN00FUBl8", "Ben 10 | Ultimate Aliens Force new Episode in Hindi | Episode 10 |", " Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("icYDTjRPADg", "Ben 10 | Escape From Aggregor  | Episode 11 |", " Ben comes up with a plan to be at more than one place at a time.");
		addVideoItem("O75dL3DE0Dk", "Ben 10 | Ultimate Aliens Force TRANSFORMATION NEW  | Episode 12 |", " Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("ujYEPk2lYMk", "Ben 10 | BEN 10 ULTIMATE Force Transformation Episode | Episode 13 |", " Under pressure from his newfound fame.");
		addVideoItem("En4QE_IEf2o", "Ben 10 | Ultimate aliens full episodes | Episode 14 |", "Enjoy your all classic Ben 10 episodes here with a proper serial..");
		addVideoItem("c_vBKKB39jE", "Ben 10 | All Way Big Scenes w/ Gameplay  | Episode 15 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("GDlGPF2JlSI", "Ben 10 | Ultimate Alien Cosmic Destruction | Episode 16 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("kH86cteTtdU", "Ben 10 | Ben 10 UA vs Ben 10 classic  | Episode 17 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("fVY55VnapQg", "Ben 10 | Ben 10 vs ben 10 ultimate aliens | Episode 18 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("HtgXGm6rvE8", "Ben 10 | Rustbucket Moments (Hindi) | Episode 19 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");
		addVideoItem("1LGnWGt7JwQ", "Ben 10 | Grey Matter Gets Eaten! | Episode 15 |", "Enjoy your all classic Ben 10 episodes here with a proper serial.");

		createPlayList("Ben 10", R.drawable.ben10);
		//==========================================================================



		addVideoItem("jo4zG7U9vrM", "Motu Patlu| Motu Patlu baby alien | Episode 01 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("KlL5ez56RvM", "Motu Patlu| John And The Hen | Episode 02 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("J0XWQN-BO4c", "Motu Patlu| Motu Patlu In Pyramid  | Episode 03 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("f6ZfXCUgqHk", "Motu Patlu| Bhukkad Patlu | Episode 04 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("2ELenfoELRY", "Motu Patlu| Third Eye | Episode 05 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("jo4zG7U9vrM", "Motu Patlu| rX11fmPYtmE | Episode 06 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("Lc8dGOqjwds", "Motu Patlu| Makaan Malik | Episode 07 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("tiHvJSI6bLo", "Motu Patlu| The Crystal Camera | Episode 08 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("VwhIzOH_Qt4", "Motu Patlu| The Bulk  | Episode 09 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("RcqyqB-GW0M", "Motu Patlu| Motu Ki Tez Aankhen | Episode 10 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("gFyGuPZi8pI", "Motu Patlu| Motu Vs John | Episode 11 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("3vqQBdBbAC0", "Motu Patlu| Meals On Wheel | Episode 12 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("xrUX88c_d_I", "Motu Patlu| John Ka Badla  | Episode 13 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("h8UZPTBCsLg", "Motu Patlu| Motu Ki Jaduyee Chheenk | Episode 14 |"," Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("RjanCeZMlPo", "Motu Patlu| Motu patlu Hindi cartoon | Episode 15 |"," Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("X6rxWRp_-og", "Motu Patlu| Foot Ball Match  | Episode 16 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("3qbIyvF8P0A", "Motu Patlu| Don Ka Birthday  | Episode 17 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("xeH0m2xSaFc", "Motu Patlu| Denture Alien | Episode 18 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("kiOD5xHhtHo", "Motu Patlu| Alien Ke Samose| Episode 19 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");
		addVideoItem("-YHIC1sFxVc", "Motu Patlu| Bhukkad Patlu | Episode 20 |", "Enjoy your all classic Motu Patlu episodes here with a proper serial.");

		createPlayList("Motu Patlu", R.drawable.motupatlu);

		//==========================================================================





		addVideoItem("hcEfpCBhS0c", "Shinchan | Chinese Type Cold Noodles Kha Ke Hi Rahenge| Episode 01 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("Grrpxum3oTU", "Shinchan | Shinchan Aaj Launch Me Hoga Composition | Episode 02 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("p66oF24dDg8", "Shinchan | Nauhgty shinchan hungama tv cartoon Latest episode| Episode 03 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("kM-Ecxf9mxo", "Shinchan | Shinchan Testi Testi Petaq Khayenge | Episode 04 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("fYDhnq7IprE", "Shinchan | Shinchan in Hindi | Fan of Cartoon| Episode 05 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("tDtvQg4YLsQ", "Shinchan | Masao Ka Jadu Ho Gaya Bekabu| Episode 06 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("9f8-WezFhOA", "Shinchan | Shinchan new hungama tv cartoon Latest episode | Episode 07 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("0iLF8Jwarbs", "Shinchan | Satisfya - Shinchan Version | Episode 08 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("FY-ZY5UTYU0", "Shinchan | Shinchan in hindi new episode| Episode 09 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("-tOnU-jiFcg", "Shinchan | Ao Chalo Bebake Banayein | Episode 10 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("yZPrcdjhfdE", "Shinchan | SHINCHAN NEW EPISODE IN HINDI WITHOUT ZOOM EFFECT| Episode 11 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("LKlfSki3dxg", "Shinchan | Shinchan Season 16 Episode| Episode 12 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("tICVAt7VeFM", "Shinchan | sinchan new episode video in hindi of all time funny| Episode 13 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("ZRsZiaXYR84", "Shinchan | Shinchan bada ho gaya in tv| Episode 14 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("xfeNhCl3VoI", "Shinchan | New Episode in Hindi| Episode 15 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("Cu6OLGMiU70", "Shinchan | Chalo Lagte He Kabdi bajar | Episode 16 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("nOS9-2hVTeM", "Shinchan | Shinchan funniest episode || latest episode.| Episode 17 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("mkk9flJUXmo", "Shinchan | KfUST7D6rKQ| Episode 18 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("bfdKTo6e5HI", "Shinchan | Shinchan Main Nibhaunga Action Kaming Ka Wada| Episode 19 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");
		addVideoItem("VomX3rEirkk", "Shinchan | New Episod| Episode 20 |", "Enjoy your all classic Shinchan episodes here with a proper serial.");

		createPlayList("Shinchan", R.drawable.chinchan);

		//==========================================================================

		addVideoItem("x1YGCzmxEoo", "Mr Bean | Hair by Mr Bean of London | Episode 01 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("du4DDUcC2gw", "Mr Bean | AIRPLANE Bean | Episode 02 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("BY0DAS56rcQ", "Mr Bean | Waking Up THE BEAN WAY | Episode 03 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("l7A6jNOewFA", "Mr Bean | Creepy Bean | Episode 04 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("ihNkjmEiUjw", "Mr Bean | Mr Bean Animated Watermelon | Episode 05 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("RbikwV0HbZs", "Mr Bean | Mr. Bean in Room | Episode 06 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("OsnvvhfnHUw", "Mr Bean | Picnic Lunch The BEAN WAY  | Episode 07 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("YBVI6yzLxkg", "Mr Bean | Black Friday SUPERMARKET DASH | Episode 08 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("rNdFPd-rUrU", "Mr Bean | A SUIT For Bean | Episode 09 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("BWZHtQXWO8I", "Mr Bean | MOBILITY SCOOTER MAYHEM! | Episode 10 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("B1Vs2IwxaK8", "Mr Bean | Sweetie Bean | Episode 11 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("xZ5gWLQg9RI", "Mr Bean | Christmas Day!  | Episode 12 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("HRLJS1TyHCg", "Mr Bean | Keeping Warm With Mr Bean | Episode 13 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("ofJ0_NbSQa0", "Mr Bean | Mr Bean Cooks CHRISTMAS DINNER  | Episode 14 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("e6VaYr7xOsw", "Mr Bean | Do-It-Yourself Mr. Bean | Episode 15 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("ABW0CKdI_30", "Mr Bean | Bean's Makeshift Caravan  | Episode 16 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("on-UjA2CwmI", "Mr Bean | Clothes Shopping In The JANUARY SALES | Episode 17 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("x4xur5k2Xu8", "Mr Bean | Bean's Ride Along | Episode 18 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("zRbVQk2zQDc", "Mr Bean | No Exit For Mr Bean! | Episode 19 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");
		addVideoItem("GAlRLwyEJIU", "Mr Bean | The Bean Test | Episode 20 |", "Enjoy your all classic Mr Bean episodes here with a proper serial.");

		createPlayList("Mr Bean", R.drawable.mrbean);

		//==========================================================================

		addVideoItem("EorJ8cEzsZo", "Mickey Mouse | Disney Shorts | Episode 01 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("wPVz4__G9b4", "Mickey Mouse | Roughin' It | Episode 02 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("M21UsdJnkBY", "Mickey Mouse | The Worm Turns | Episode 03 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("rIYadOpFMsk", "Mickey Mouse | Mickey Mouse Clubhouse Mickey's TRAILER | Episode 04 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("yUDc78znrLM", "Mickey Mouse | Thru The Mirror (1936) Mickey Mouse complete | Episode 05 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("rO3uyUvmwcw", "Mickey Mouse | Mickey Mouse Clubhouse | Episode 06 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("7s3nBOSXZeo", "Mickey Mouse | Mickey and Friends Go Rafting | Episode 07 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("bt_gHTfYoBE", "Mickey Mouse | Disney Donald Duck, Clubhouse  | Episode 08 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("Z34MJIVqHq0", "Mickey Mouse | Rainbow Fun \uD83C\uDF08 | Episode 09 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("bj_l44W8Ku0", "Mickey Mouse | It's Donald Duck's Birthday!  | Episode 10 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("07Vs2CSBouM", "Mickey Mouse | Happy Thanksgiving from Mickey and Friends!  | Episode 11 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("UPKWCCh4fPU", "Mickey Mouse | A Mickey Mouse Cartoon | Episode 12 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("dvVvm6nGxTI", "Mickey Mouse | Bow-Toons Adventures for 30 Minutes! | Episode 13 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("51thw_ryhLk", "Mickey Mouse | Alimente os Pássaros  | Episode 14 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("VBKgPmS5Fyw", "Mickey Mouse | A Mickey Mouse Cartoon | Episode 15 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("REHJ1lz_HLQ", "Mickey Mouse | The Little Whirlwind | Episode 16 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("5iaCJbN9KYw", "Mickey Mouse | Donald Duck & Chip and Dale Cartoons | Episode 17 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("GzQjT9tL8j8", "Mickey Mouse | Hot Diggity Dog Tales Compilation  | Episode 18 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("AVohVR2By5o", "Mickey Mouse | Mickey Mouse Mixed Up Adventures | Episode 19 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");
		addVideoItem("GzQjT9tL8j8", "Mickey Mouse | Hot Diggity Dog Tales Compilation Part | Episode 20 |", "Enjoy your all classic Mickey Mouse episodes here with a proper serial.");

		createPlayList("Mickey Mouse", R.drawable.mickymouse);

		//==========================================================================

		addVideoItem("xFmpFiMdFB4", "The Simpsons |Maggie hates Milhouse |Episode 01 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("XtQ7lVdlc9o", "The Simpsons |Homer wants to be a superhero |Episode 02 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("sVxMNqefzVk", "The Simpsons |THE SIMPSONS GAME The Movie  |Episode 03 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("kIrIgFL2I1Y", "The Simpsons |The Simpsons - STUDENT LIFE |Episode 04 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("w6SWV6nIpuo", "The Simpsons |Bart and Lisa rescued Homer |Episode 05 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("C2SeodkftX4", "The Simpsons |Marge chooses Homer underwear |Episode 016 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("dJ_vD6NcnfI", "The Simpsons |Best Of Bart and Homer |Episode 07 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("Tqth0fKo0_g", "The Simpsons |The Simpsons - Lisa's First Word |Episode 08 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("EH1bP7rY8MY", "The Simpsons |In a indoor Waterpark (Homer, Marge, Bart, Lisa) |Episode 09 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("xk0Ql18vXW8", "The Simpsons |Bart tries to kill Homer who has become a zombie|Episode 10 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("Wwe16D8w2lI", "The Simpsons |Simpsons Predictions for 2022 |Episode 11 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("W46YypkU250", "The Simpsons |The police do a strip dance |Episode 12 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("HuBO5_RCv3U", "The Simpsons |Best Gift!  |Episode 13 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("dBaGE8mwbVQ", "The Simpsons |Homer is addicted to a great tub |Episode 14 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("JA8CV_BKWck", "The Simpsons |Lisa became a famous comedian |Episode 15 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("x_Ak5c2HHFc", "The Simpsons |Bart lives in the wild with wild dogs | Episode 16 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("ubAWTU0ivsk", "The Simpsons |Bart's death was on the news |Episode 17 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("M4mXnYsFcZE", "The Simpsons |New Dad!  |Episode 18 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("mkJ6Lwh4_u4", "The Simpsons |DANGER THINGS |Episode 19 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");
		addVideoItem("VsGSrDdxLvs", "The Simpsons |Treehouse of horror |Episode 19 |", "Enjoy your all classic The Simpsons episodes here with a proper serial.");

		createPlayList("The Simpsons", R.drawable.shimpsons);

		//==========================================================================

		addVideoItem("h2oKmInMfts", "Looney Tunes |Best Cold Opens |Episode 01 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("Q8AZ16uBhr8", "Looney Tunes |BUGS BUNNY CARTOON COMPILATION |Episode 02 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("8fKNkiJl_Ro", "Looney Tunes |Summer Vacation! |Episode 03 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("6KDgDYdug6M", "Looney Tunes |Coyote's Best Failed Plans |Episode 04 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("GEUuZ_UzBQw", "Looney Tunes |Wile E. Coyote Genius vs. Bugs Bunny |Episode 05 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("tnOojGdbyvo", "Looney Tunes |Frío abre el vol. 2  |Episode 06 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("7DL4IJTYWEc", "Looney Tunes |Tweety at the Zoo |Episode 07 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("TllPSDlcb3E", "Looney Tunes |Who is the Greatest Trickster? |Episode 08 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("ne-jaMWpKmw", "Looney Tunes |Best Cold Opens  |Episode 09 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("ZJJHL5p9UIE", "Looney Tunes |Rookie Revue |Episode 10 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("UAgWr8hZQ6Y", "Looney Tunes |Hey Bugsy Boy! |Episode 11 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("Ahb_b7Kzras", "Looney Tunes |Orange is the New Bugs |Episode 12 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("gi5Hm2MfyjU", "Looney Tunes |The Roadrunner and the Coyote |Episode 13 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("WGW_AzayLFI", "Looney Tunes |Have Some Food! |Episode 14 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("4xOFGVD4yNI", "Looney Tunes |The Wacky Wabbit |Episode 15 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("zjhsxqkh6EA", "Looney Tunes |The Amazing Lola Bunny |Episode 16 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("6kBaPF8wkGA", "Looney Tunes |Looney Tunes em Português|Episode 17 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("DJFyQZs2EqA", "Looney Tunes |Best of Lola and Bugsy \uD83D\uDC97 |Episode 18 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("hmi8kg7fZo8", "Looney Tunes |Super Heroic!  |Episode 19 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");
		addVideoItem("bNEydq6EoRs", "Looney Tunes |Was That Bugs Bunny?  |Episode 20 |", "Enjoy your all classic Looney Tunes episodes here with a proper serial.");

		createPlayList("Looney Tunes", R.drawable.tunes);

		//==========================================================================

		addVideoItem("D6Mv6pMCF0o", "Pikachu | Ash trying to bring Pikachu in Pokeball  |Episode 01 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("xM24hiwTAe8", "Pikachu |  Pokémon: Indigo League  |Episode 02 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("cCs2ErXu9a4", "Pikachu | All Shorth Pokemon Battle So Far|Episode 03 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("_0fktNnvy4M", "Pikachu | Ash & Pikachu's Epic Battle Moments |Episode 04 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("d722bGusttw", "Pikachu | Don’t Touch That ‘dile  |Episode 05 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("Zyt2GKb6qWw", "Pikachu | I Choose You!  |Episode 06 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("6um551cijA4", "Pikachu | Legends Never Die |Episode 07 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("EXAy0Gb06NQ", "Pikachu | Pokémon Journeys |Episode 08 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("7Vmw9xqaryM", "Pikachu | Pokémon: Indigo League | |Episode 09 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("Zx2CBt72Ji8", "Pikachu | Pikachu can mimic any Pokemon in existence! |Episode 10 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("tsWC-BZLIu4", "Pikachu | Pokémon, la série : Soleil et Lune – Ultra-Aventures |Episode 11 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("l6LpSkrKPb4", "Pikachu | ASH VS DRAKE  |Episode 12 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("NiEABxi8G4U", "Pikachu | Walk Down Memory Lane with a Pokémon |Episode 13 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("O-o7knB5bYk", "Pikachu | Ash vs Alain - Full Battle  |Episode 14 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("4cJMfb4jDcw", "Pikachu | Every time Froakie/Frogadier/Greninja save Pikachu |Episode 15 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("J7kAYvMtd0g", "Pikachu | Vysaur's Mysterious Tower! |Episode 16 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("H9a4UU44r7c", "Pikachu | UK: Dragonite vs. Charizard  |Episode 17 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("qeE_Qm0Ygtg", "Pikachu | Ash vs Paul & Tobias |Episode 18 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("80acmYAM7v4", "Pikachu | Charizard getting disrespected by Dragonites!  |Episode 19 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");
		addVideoItem("LA9mX6uxgvM", "Pikachu | Following a Maiden’s Voyage  |Episode 19 |", "Enjoy your all classic Pikachu episodes here with a proper serial.");

		createPlayList("Pikachu", R.drawable.picachu);

		//==========================================================================

		addVideoItem("w5M6KLqy55A", "Naruto |The Power Of Naruto |Episode 01 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("_ubNTNiEm3s", "Naruto |Obito successfully kills Konan |Episode 02 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("DttTRPKdq-0", "Naruto |Naruto broke all seal |Episode 03 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("UmFwApxD5ow", "Naruto |Naruto vs Sasuke final battle |Episode 04 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("0bPM3smh3lI", "Naruto |Horrifying battle vs Orochimaru |Episode 05 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("-HGVHr2tIuQ", "Naruto |Naruto Shippuden |Episode 06 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("jU2i-c6fAfY", "Naruto |Naruto Shows Nine Tails Form For Shin Uchiha |Episode 07 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("kXnGgWmyjss", "Naruto |Completely control Kurama chakra power |Episode 08 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("EIF8jd2rnlo", "Naruto |Naruto doesn't bow to the power |Episode 09 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("UbY14EDR0kg", "Naruto |Naruto has more motivation to take Sasuke back |Episode 10 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("Zq6DDnj-Z0M", "Naruto | Identity for cheating in the chunin exam |Episode 11 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("O3ioOsqokp4", "Naruto |Neji cover for Naruto |Episode 12 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("PoS8_m-jJAk", "Naruto |Naruto became an idol |Episode 13 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("AZgLV_aebBM", "Naruto |The Story of Legendary Three Ninja |Episode 14 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("0n8sr79gPrA", "Naruto |Naruto has gradually taken control of Kurama |Episode 15 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("ssQnnMn-GaY", "Naruto |east Rasengan against The 3rd Raikage |Episode 16 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("d2akA6RhkpE", "Naruto |Sasuke Training Boruto English Dub |Episode 17 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("kIgN1nVK9h4", "Naruto |Naruto played with Kawaki  |Episode 18 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("ipUhLCadHp8", "Naruto |Tsunade in front of Jiraiya |Episode 19 |", "Enjoy your all classic Naruto episodes here with a proper serial.");
		addVideoItem("C0WgtaJV7cM", "Naruto |TFunny Moment Naruto After Great Ninja War |Episode 20 |", "Enjoy your all classic Naruto episodes here with a proper serial.");

		createPlayList("Naruto", R.drawable.naruto);

		//==========================================================================

		addVideoItem("hL3GzVjC80c", "My Hero Academia |Endeavor vs Super Noumu  |Episode 01 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("JmlucuwuK6g", "My Hero Academia |Deku used all his strength to go rescue Eri |Episode 02 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("zpe5MNhiogA", "My Hero Academia |Dominated Being In My Hero Academia |Episode 03 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("wpOhT35YtWg", "My Hero Academia |Deku vs Todoroki  |Episode 04 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("Wh1_nlLpNSM", "My Hero Academia |Boku No Hero Academia |Episode 05 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("nJA-ZYdxwfs", "My Hero Academia |Boku No Hero Academia Tiktok Compilation Edits |Episode 06 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("7Xru906M2Bk", "My Hero Academia |CONFIRMS Forced To Change Story Due To Fans!  |Episode 07 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("8xWFJzlcpV0", "My Hero Academia |Midoriya Promptly Saved Eri From Chisaki Kai !! |Episode 08 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("I6gfsEecRPw", "My Hero Academia |Deku fights the Gel Criminal  |Episode 09 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("sKPkt7pwwIE", "My Hero Academia |My Hero Academia AMV |Episode 10 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("EiCv4xBGlwU", "My Hero Academia |Midoriya defeat Shinso also using new Quirk |Episode 11 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("v4M-Ja4Z_wY", "My Hero Academia |TRIPLE FUSION with Shigaraki and Toya |Episode 12 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");
		addVideoItem("mG9JoVx6JzI", "My Hero Academia |Funny moments english dub |Episode 13 |", "Enjoy your all classic My Hero Academia episodes here with a proper serial.");

		createPlayList("Hero Academia", R.drawable.heroaca);

		//==========================================================================


		addVideoItem("BbHkJ7AVC5c", "Educational Videos |Alphabet Learning Cartoon  |Episode 01 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("4XGLPTtn4xQ", "Educational Videos |Diana and Roma learn the alphabet and how to count |Episode 02 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("wZq2tyLNPRU", "Educational Videos |19 Best Short English Stories for Kids Collection |Episode 03 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("xPq1KrYWbqo", "Educational Videos |Days Of The Week |Episode 04 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("8irSFvoyLHQ", "Educational Videos |Learn English for Kids |Episode 05 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("Bb51pxRknuo", "Educational Videos |Color Water 3D Kids Toddler Babies Learn Colors |Episode 06 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("l4dCByK0TN4", "Educational Videos |50 minutes Kids cartoon Dialogues |Episode 07 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("mSEYTJZ4N_c", "Educational Videos |LEARNING VIDEOS FOR KIDS |Episode 08 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("OTuph9pJWU4", "Educational Videos |The Dr.Binocs Show |Episode 09 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");
		addVideoItem("AjgD3CvWzS0", "Educational Videos |Numbers & Letters  |Episode 10 |", "Enjoy your all classic Educational Video episodes here with a proper serial.");

		createPlayList("Learn", R.drawable.learn);

		//==========================================================================

		addVideoItem("vOTB_DF_H2o", "Cartoon Songs |Chipmunks Singing |Episode 01 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("CwSQTfHokG0", "Cartoon Songs |Dilbar Dilbar | chipmunks song |Episode 02 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("6qBTWBd7TGM", "Cartoon Songs |Chu Chu Train Cartoon Video for Kids Fun |Episode 03 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("3DyhImD1L10", "Cartoon Songs |New Malayalam Kid's nursery song from Kathu 4 |Episode 04 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("a4MJlxaEhu0", "Cartoon Songs |Baby Dance Cartoon Video Jungle Edition |Episode 05 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("OcSq7_n-6-A", "Cartoon Songs |Navaratri Special |Episode 06 |", "Enjoy your all Song episodes here with a proper serial.");
		addVideoItem("qWwMqsgIifk", "Cartoon Songs |Bingo and more Sing Along Kids Songs |Episode 07 |", "Enjoy your all Song episodes here with a proper serial.");

		createPlayList("Sing With Us", R.drawable.song);

		//==========================================================================















	}


}

