package testGame;

public class Story {



	// 物語の最初
	public static void  opening() {

	System.out.println("<劉備>張飛よ。君に託したい仕事がある。");
	System.out.println("<張飛>どうしたんだ兄貴。");
	System.out.println("<劉備>先ほど、曹操からこのようなPDFが届いたのじゃ。");

    }



	// 曹操からのpdfを読む場面
	public static void pdfRead() {

		int answer1 = Select.selectRead();


		switch(answer1) {

		case 1:
			System.out.println("---------");
			System.out.print("蜀の名産品である『たぴおかみるくてぃー』を早急に");
			System.out.println("洛陽に届けてもらいたい。");
			System.out.println("余の喉は乾ききっておる。");
			System.out.println("---------");

			break;

		case 2:

			break;

		}

	}



	// 孔明が壺を差し出す場面
	public static void koumeiTapioka() {

		int answer2 = Select.next();


		switch(answer2) {

		case 1:

			System.out.println("<張飛>まったく。なんと傲慢なのだ！");
			System.out.println("<劉備>支払い方法がないとはなんと無礼な…。");
			System.out.println("<張飛>そこではない気がするが…兄貴…。");
			System.out.print("<孔明>張飛殿には、");
			System.out.println("この『たぴおかみるくてぃー』を届けてもらいたい");
			System.out.println("<張飛>た、たぴ、みるく？？");
			System.out.println("<孔明>この壺に入っている. さぁ.");
			break;

		default:


		}



	}



	// たぴおかみるくてぃーを手に入れる場面
	public static void tapiokaGet() {

		int answer3 = Select.selectGet();


		switch (answer3) {

		case 1:
			System.out.println("▽張飛は『たぴおかみるくてぃー』をGETした!!");
			System.out.println("");
			System.out.println("----------");
			System.out.print("<劉備>この『たぴおかみるくてぃー』を洛陽の曹操");
			System.out.println("のもとに無事届けたら、任務完了だ");
			System.out.println("<孔明＞ただし注意点があります、張飛殿。");
			break;

		default:
			System.out.println("<関羽>何をしておる！受け取れい！！");
			System.out.println("▽張飛は『たぴおかみるくてぃー』をGETした!!");
			System.out.println("");
			System.out.println("----------");
			System.out.print("<劉備>この『たぴおかみるくてぃー』を洛陽の曹操");
			System.out.println("のもとに無事届けたら、任務完了だ");
			System.out.println("<孔明＞ただし注意点があります、張飛殿。");

		}
	}



	// 孔明からの注意事項
	public static void koumeiRules() {

		int answer4 = Select.selectListen();


		switch(answer4) {

		case 1:

			System.out.println("----------");
			System.out.print("あくまで、張飛殿は");
			System.out.println("『うーばーいーつ』を装ってください.");
			System.out.println("張飛殿であることを悟られてしまったら");
			System.out.println("おそらく、捕らえられてしまうでしょう.");
			System.out.println("魏の成宣と表厳は用心深い男です.");
			System.out.println("届けるときには");
			System.out.println("『うーばーいーつです！』");
			System.out.println("と必ず答えてください.");
			System.out.println("くれぐれも一言一句お間違えの無いように….");
			System.out.println("そして絶対に盗み飲みしないように。");
			System.out.println("----------");

			break;

		case 2:

			System.out.println("<孔明>痛い目にあっても知りませんぞ");

			break;


		}
	}



	// 張飛が出発する場面
	public static void departure() {

		int departure = Select.next();

		switch (departure) {

		case 1:

			System.out.println("<張飛>とにかく『うーばーいーつ』になりきるんだな！");
			System.out.println("　　　" + "兄貴と諸葛殿の願いならばしょーがねぇ！");
			System.out.println("　　　" + "この孟徳、必ずや成功させるぞ！！");
			System.out.println("");

			break;

		default:


		}


	}



	// メニュー選択場面（ノーマル張飛）
	public static void menu(MainCharacter mc) {

		int menu = Select.selectMenu();

		switch(menu) {

		case 1:

			break;

		case 2:

			mc.sleep();
			menu(mc);

			break;

		case 3:

			mc.eat();

			break;
		}



	}



	// ステージ１：襄陽（伏兵）
	public static void stage1() {

		System.out.println("");
		System.out.println("[襄陽]");
		System.out.println("");
		System.out.println("----------");
		System.out.println("<張飛>ふぅ…。洛陽まではまだ遠いな。");
		System.out.println("<山賊>そこの商人またれよ！");
		System.out.println("<張飛>何奴だ！！");
		System.out.println("<山賊>その腰に結んだ壺を置いていけ！");
		System.out.println("こうなったら、やるしかねぇ…！！");
		System.out.println("");
		System.out.println("戦闘スタート！！");
		System.out.println("----------");
		System.out.println("");

	}



	// ステージ２：宛（徐晃）
	public static void stage2() {

		System.out.println("");
		System.out.println("[宛]");
		System.out.println("");
		System.out.println("----------");
		System.out.println("<張飛>幽谷関まではもうすぐだ！！");
		System.out.println("<徐晃>その肩に担いだ蛇矛…まて！");
		System.out.println("　　　" + "蜀の玄徳の義兄弟・張飛孟徳と見た！");
		System.out.println("<張飛>魏の将・徐晃だな。首を頂戴してやる！！");
		System.out.println("");
		System.out.println("戦闘スタート！！");
		System.out.println("----------");
		System.out.println("");

	}



	// ステージ３：幽谷関（夏侯惇）
	public static void stage3() {

		System.out.println("");
		System.out.println("[幽谷関]");
		System.out.println("");
		System.out.println("----------");
		System.out.println("<張飛>この関を超えれば、洛陽だ！");
		System.out.println("<？？>待っておったぞ。張飛殿。");
		System.out.println("<張飛>その左目の眼帯。まさか。");
		System.out.println("<夏侯惇>徐晃の仇はここで取らせてもらう");
		System.out.println("<夏侯惇>その『たぴおかみるくてぃー』だけもらおうか");
		System.out.println("<張飛>覚悟…！！");
		System.out.println("");
		System.out.println("戦闘スタート！！");
		System.out.println("----------");
		System.out.println("");


	}

	// ステージ１のバトル場面
	public static void battle1(MainCharacter mc, Soldier s) {


		while (s.hp >= 0 && mc.hp >= 0) {

			int b1 = Select.selectAttack();


			switch(b1) {

			case 1: // 攻撃したときの処理

				mc.attack(s);
				s.attack(mc);
				System.out.println("★" + mc.name + "のHPは" + Math.max(mc.hp, 0) + "です");
				System.out.println("★" + s.name + "のHPは" + Math.max(s.hp,  0) + "です");


				break;

			default: // 攻撃しなかったときの処理

				System.out.println(mc.name + "は仁王立ちしている");
				s.attack(mc);
				System.out.println("★" + mc.name + "のHPは" + Math.max(mc.hp, 0) + "です");
				System.out.println("★" + s.name + "のHPは" + Math.max(mc.hp, 0) + "です");


			}

		}

		s.run();


	}

	// ステージ２のバトル場面
	public static void battle2(MainCharacter mc, SubBoss sub) {


		while (sub.hp >= 0 && mc.hp >= 0) {

			int b2 = Select.selectAttack();


			switch(b2) {

			case 1: // 攻撃した時の処理

				mc.attack(sub);
				sub.attack(mc);
				System.out.println("★" + mc.name + "のHPは" + Math.max(mc.hp, 0) + "です");
				System.out.println("★" + sub.name + "のHPは" + Math.max(sub.hp, 0) + "です");


				break;

			default: // 攻撃しなかったときの処理

				System.out.println(mc.name + "相手の動きを見ている");
				sub.attack(mc);
				System.out.println("★" + mc.name + "のHPは" + Math.max(mc.hp, 0) + "です");
				System.out.println("★" + sub.name + "のHPは" + Math.max(sub.hp, 0) + "です");


			}
		}

		sub.run();
	}

	// 	ステージ３のバトル場面
	public static void battle3(SuperCharacter sc, LastBoss last) {


		while (last.hp >= 0 && sc.hp >= 0) {

			int b3 = Select.selectAttack();


			switch(b3) {

			case 1: // 攻撃した時の処理

				sc.attack(last);
				last.attack(sc);
				System.out.println("★" + sc.name + "のHPは" + Math.max(sc.hp, 0) + "です");
				System.out.println("★" + last.name + "のHPは" + Math.max(last.hp, 0) + "です");


				break;

			default: // 攻撃しなかったときの処理

				System.out.println(sc.name + "は" + last.name + "の動きを見ている");
				last.attack(sc);
				System.out.println("★" + sc.name + "のHPは" + Math.max(sc.hp, 0) + "です");
				System.out.println("★" + last.name + "のHPは" + Math.max(last.hp, 0) + "です");


			}
		}

		last.run();



	}

	// 張飛が洛陽に到着
	public static void arrival() {

		int answer5 = Select.next();

		switch(answer5) {

		case 1:

			System.out.println("[洛陽]");
			System.out.println("");
			System.out.println("----------");
			System.out.println("<張飛>やっと…洛陽についたぞ!!");
			System.out.println("<成宣>そこの大男、待たれよ");
			System.out.println("　　　" + "なにゆえ、閣下の屋敷に入ろうとするのだ！！");
			System.out.println("<張飛>曹操殿にこの壺を届けに来たのです");
			System.out.println("<表厳>ふん！その身なりで商人だと？笑わせるな！！");
			System.out.println("　　　" + "そなたはどこのものか！！名乗れい！！");
			System.out.println("");
			System.out.println("合言葉を答えよう");
			System.out.println("----------");

			String word = new java.util.Scanner(System.in).nextLine();
			System.out.println("----------");
			System.out.println("");
			System.out.println("<張飛>" + word );

			if (word.equals("うーばーいーつです！")) {

			System.out.println("<成宣>おお、うーばーの方であったか");
			System.out.println("<表厳>これはこれは…ささ、中へ");
			System.out.println("");

		} else if (word.equals("でまえかんです！")){

			System.out.println("<成宣>んん！出前館など頼んでおらんわ！！");
			System.out.println("<表厳>貴様！さては呉の周瑜の密偵だな！とらえろ！！");
			System.out.println("GAME OVER");
			System.out.println("");
			// 処理の中断
			System.exit(0);

		} else {

			System.out.println("<成宣>なんと怪しい奴だ！とらえろ！！");
			System.out.println("GAME OVER");
			System.out.println("");
			// 処理の中断
			System.exit(0);

		}

			break;

		default:

		}

	}

	// 曹操と出会うシーン
	public static void ending1() {

		int ending1 = Select.next();

		switch(ending1) {

		case 1:

			System.out.println("");
			System.out.println("<曹操>おお！待っておったぞ！！");
			System.out.println("<張飛>『たぴおかみるくてぃー』をお届けに参りました");
			System.out.println("<曹操>ほれ、代金じゃ");
			System.out.println("<張飛>有りがたき幸せにございます");
			System.out.println("");


		default:


		}
	}

	// 曹操、暗殺のシーン
	public static void ending2() {

		int ending2 = Select.next();

		switch(ending2) {

		case 1:

			System.out.println("");
			System.out.println("<曹操>ごくごくっ…ん～うまいっ！！");
			System.out.println("　　　" + "うぐぐっ！ぐはぁ！");
			System.out.println("<成宣>どうされました！！閣下！！");
			System.out.println("<曹操>おのれ…たばかったなぁ…がはぁっ…");
			System.out.println("");
			System.out.println("曹操は、そのまま、息を引き取った");
			System.out.println("");
			System.out.println("");

			break;

		default:



		}


	}

	// 成都、諸葛亮のシーン
	public static void ending3() {

		int ending3 = Select.next();

		switch(ending3) {

		case 1:

			System.out.println("そのころ…成都では…");
			System.out.println("");
			System.out.println("<孔明>風が変わった…今頃、策が成功しているだろうか");
			System.out.println("");
			System.out.println("GAME CLEAR!!");

			break;

		default:


		}
	}

}
