
public class Opening implements Runnable {

	String opening = "먼 옛날, 아주 먼 옛날 세상의 중심의 어떤 왕국의 시골마을에 아브라함이라는 목수가 살고 있었다. 그는 부인 사라와 단둘이 살고 있었다.\n"
			+ "금술이 좋았으나 이들 부부에게는 슬하에 자식이 없었다. 그러던 어느 날, 목수이던 아브라함은 여느 때와 같이 숲 속으로 나무를 베러 갔다.\n"
			+ "새벽부터 열심히 일을 하던 아브라함은 늦은 점심을 먹고 우물가 옆에 누워 잠깐 휴식을 취했다.\n"
			+ "휴식을 취하다 깜빡 잠이 든 아브라함은 뒤척이다 실수로 머리맡에 둔 투박한 도끼를 우물가에 빠뜨리고 말았다.\n"
			+ "어리둥절한 가운데 우물가에서 뜬금없이 신선 무하마드가 '펑!!'하며 등장하였고,(머리에 피를 흘리며)도끼 여러 자루를 내보이며 말했다.\n\n"
			+ "무: \"나의 꿀맛 같은 오침을 방해한 것이 네 놈이냐!?\"\n" 
			+ "아: \"제가 잠시 잠이 든 사이 실수로 제 도끼를 떨어뜨렸습니다. 살려주십시오~.\"\n"
			+ "무: \"괘씸하지만 용서해주마, 그런데 너의 도끼가 어떤 것이냐? 자신의 연장을 떨구는 한량들이 많아 수두룩하구나\"\n"
			+ "무: \"이 금도끼가 니 도끼냐? 아니면 이 은도끼가 니 도끼더냐? 그렇다면 이 비브라늄 도끼가? 설마 이 낡은 도끼는 아니겠지?\"\n"
			+ "아: \"(낡은 자신의 도끼 대신 새 것을 장만하고 싶었던 아브라함은)외람되오나, 금빛 도끼가 제 도끼입니다.\"\n"
			+ "무: \"네 이놈~~~~!!!!! 내 얼굴에 선혈이 낭자하며 이 허접한 도끼에 핏자국이 남아있거늘! 어디 감히 거짓말을 하느뇨!?\"\n"
			+ "아: \"(딱걸린 걸 직감한 아브라함은 납짝 엎드리며)죄..죄송합니다. 죽을 죄를 지었습니다. 집안 형편이 어려워 저도 모르게 그만...\"\n"
			+ "무: \"천벌을 받을 놈~~!\"\n"  
			+ "무: \"내 너의 모가지를 비틀어 나무에 매달고 싶으나 피곤하여 이번만 용서해주마. 허나 한가지 조건이 있다.\"\n"
			+ "아: \"죽을 죄를 지었습니다요~ 뭐든지 시키는대로 하겠나이다~ ㅠㅠ\"\n"
			+ "무: \"나에게는 한명의 양자가 있다. 너보다 더 무례한 놈이 10년 전 우물가에 갓난 아기를 버리고 갔구나.\"\n"
			+ "무: \"그런데 이 녀석이 무럭무럭 자라서 감당이 안 되고 귀찮구나. 내 너에게 잘못을 만회할 기회를 주마!\"\n" 
			+ "아: \"'기회'라 하면 무엇을 말씀하시는 겁니까?\"\n"
			+ "무: \"10살인 이 아이를 데려가 성년이 될 때까지 키우거라. 어떻게 키웠는지에 따라 내 너를 심판할지,포상을 할지 결정하마.\"\n"
			+ "아: \"예~ 저도 자식이 없는터라 뜻을 받들어 잘 키우도록 하겠습니다. 용서해 주셔서 감사합니다.\"\n"
			+ "무: \"못난 놈~!! 양심에 털은 났구나. 데려가서 잘 케어하도록 하거라. 내 너에게 모든 도끼를 다 주겠다. 양육비라 생각하걸아.\"\n"
			+ "아: \"어이쿠!(금도끼를 보며 침을 꿀꺽 삼키며)감사합니다~. 아이는 제가 책임지고 잘 돌보도록 하겠습니다.\"\n\n"
			+ "이리하여 졸지에 10세의 양자를 얻게 된 아브라함은 집에 돌아와 사라와 함께 아이 이름을 정하는데...\n";
	
	public void run() {

		try {
			for (int i = 0; i < opening.length(); i++) {
				System.out.print(opening.charAt(i));
				Thread.sleep(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
