# sensong
import java.util.Scanner;

public class fuli {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner caculate = new Scanner(System.in);
int a = 0;
while (a == 0 || a == 1 || a == 2 || a == 3||a==4||a==5) {
System.out.println("请选择1/2/3/4/5/6：\n1.复利计算终值2.复利计算本金3.单利计算本息4.复利计算年数5.复利年利率6.计算总资产");
int a1 = caculate.nextInt();
if (a1 == 1) {
fuli.CFutureValue();
break;
} else if (a1 == 2) {
fuli.CPresentValue();
break;
}

else if (a1 == 3) {
fuli.PrincipalAndInterest();
break;
}
else if(a1==4){
fuli.CPresentValue1();
}
else if (a1 == 5) {
fuli.PrincipalAndInterest1();
break;
}
else if (a1 == 6) {
fuli.PrincipalAndInteres();
break;
}
else {
System.out.println("\n您的输入错误");
a1 = a;
}
}
}

// 复利计算终值
static void CFutureValue() {
Scanner fuli = new Scanner(System.in);
System.out.println("请输入本金：");
double PresentValue = fuli.nextDouble(); // 本金
System.out.println("请输入存款年数：");
int year = fuli.nextInt(); // 存钱年数
System.out.println("请输入利率：");
double r = fuli.nextDouble(); // 利率
double sum = 1;
for (int i = 1; i <= year; i++) {
sum = (1 + r) * sum;
}
System.out.println("总额为：" + sum * PresentValue);
}

// 复利计算本金
static void CPresentValue() {

Scanner fuli = new Scanner(System.in);
System.out.println("请输入终值：");
double sum = fuli.nextDouble(); // 终值
System.out.println("请输入存款年数：");
int year = fuli.nextInt(); // 存钱年数
System.out.println("请输入利率：");
double r = fuli.nextDouble(); // 利率
double PresentValue = 1;
for (int i = 1; i <= year; i++) {
PresentValue = (1 + r) * PresentValue;
}
System.out.println("总额为：" + sum * (1 / PresentValue));
}

// 单利计算本息
static void PrincipalAndInterest() {
Scanner danli = new Scanner(System.in);
System.out.println("请输入本金：");
double PresentValue = danli.nextDouble(); // 本金
System.out.println("请输入存款年数：");
int Annuityyear = danli.nextInt(); // 存钱年数
System.out.println("请输入利率：");
double r = danli.nextDouble(); // 利率
double sum1 = 1;
sum1 = (1 + r * Annuityyear) * PresentValue;
System.out.println("本息为：" + sum1);
}
//复利年数
static void CPresentValue1() {

Scanner fuli = new Scanner(System.in);
System.out.println("请输入终值：");
double sum = fuli.nextDouble(); // 终值
System.out.println("请输入本金：");
double PresentValue = fuli.nextDouble(); // 本金
System.out.println("请输入利率：");
double r = fuli.nextDouble(); // 利率
double year;
year=(sum-PresentValue)/(PresentValue*r);
System.out.println("年数：" + year);
}
//复利年利率
static void PrincipalAndInterest1() {
Scanner fuli = new Scanner(System.in);
System.out.println("请输入本金：");
double PresentValue = fuli.nextDouble(); // 本金
System.out.println("请输入终值：");
double sum = fuli.nextDouble(); // 终值
System.out.println("请输入存款年数：");
int year = fuli.nextInt(); // 存钱年数
double r;
r=(sum-PresentValue)/(PresentValue*year);
System.out.println("年利率：" + r);
}
//
static void PrincipalAndInteres() {
Scanner fuli = new Scanner(System.in);
System.out.println("请输入本金：");
double PresentValue = fuli.nextDouble(); // 本金
System.out.println("请输入存款年数：");
int Annuityyear = fuli.nextInt(); // 存钱年数
System.out.println("请输入利率：");
double r = fuli.nextDouble(); // 利率
double sum=0;
for(int i=1;i<=Annuityyear;i++){
sum+=PresentValue*Math.pow(1+r, i);
}
//每月还款金额
System.out.println("总资产" + sum);
}

static void haikuan(){
Scanner fuli = new Scanner(System.in);
System.out.println("请输入贷款金额：");
double PresentValue = fuli.nextDouble(); // 本金
System.out.println("请输入期限年数：");
int year = fuli.nextInt(); // 存钱年数
System.out.println("请输入年利率：");
double r = fuli.nextDouble(); // 利率
double mon;
mon=PresentValue*year*r/12;
System.out.println("每月还款金额：" + mon);
}



}
