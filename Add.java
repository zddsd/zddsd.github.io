package numTest;  
/** for循环实现类似 9+99+999的运算
 * 思路：99=9*10^0+9*10^1  999=9*10^0++9*10^1++9*10^2
 * 用递归计算出每个加数
 * 然后用for循环 将加数相加 得到运算结果
 */
public class Add {
	static int i = 0;
	static int gSingleDigit=0;
	public static void main(String[] args) {
		Add add = new Add();
		add.calculate(8,3);
	}
	/**
	 * 
	 * @param singleDigit 个位数字
	 * @param num 位数
	 */
	public void calculate(int singleDigit,int num) {
		int res=0;
		gSingleDigit=singleDigit;
		for (i = 1; i <= num; i++) {
			//递归求出加数
			res+=m(i);
			System.out.print(m(i));
			if(i<num){
			System.out.print("+");
			}else{
			System.out.print("=");
			}
			
		}
		System.out.println(res);
	}
	/**
	 * 
	 * @param singleDigit 个位数字
	 * @param cubeNum 次方
	 * @param preRes 前一项结果
	 * @return
	 */
	public int calculateAddNum(int singleDigit,int cubeNum,int preRes) {
		return (int) (singleDigit * (Math.pow(10, cubeNum))) + preRes;
	}
	/**
	 * 
	 * @param recNumber 位数 也是递归次数
	 * @return
	 */
	public int m(int recNumber){
		if(recNumber==1)
			return calculateAddNum(gSingleDigit,recNumber-1,0);
			
		else 
			return calculateAddNum(gSingleDigit,recNumber-1, m(recNumber-1));
	}
}
 
