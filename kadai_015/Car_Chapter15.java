package kadai_015;

public class Car_Chapter15 {
	// フィールド （内部データ）
		private int gear  =  1; // ギア
		private int speed = 10; // ギアに対する速度
			
		// 【メソッド】 ギアを変えて速度を変える
		// afterGear:変えたギア
		public void gearChange(int afterGear) {
		    switch (afterGear) {
		        case 1:
		            speed = 10;
		            break;
		        case 2:
		            speed = 20;
		            break;
		        case 3:
		            speed = 30;
		            break;
		        case 4:
		            speed = 40;
		            break;
		        case 5:
		            speed = 50;
		            break;
		        default:
		            speed = 10;
		            break;
		    }
		    // ギアを変更する
		    gear = afterGear;
		 // ギアチェンジの表示
		    System.out.println("ギアを1から" + afterGear + "に切り替えました");
		}
		// 【メソッド】 ギアを変えた後の速度を表示
		// run:ギアチェンジ後の速度
		public void run() {
			System.out.println("速度は時速" + speed + "kmです");
		}
	}
