// Last updated: 09/09/2026, 11:07:56
1class Solution {
2    public String fractionAddition(String expression) {
3        int den=1;
4        int num=0;
5        Scanner sc=new Scanner(expression).useDelimiter("/|(?=[-+])");
6        while(sc.hasNext()){
7            int a=sc.nextInt(),b=sc.nextInt();
8            num=num*b+a*den;
9            den*=b;
10            int g=gcd(num,den);
11            num/=g;
12            den/=g;
13        }
14        return num+"/"+den;
15    }
16    private int gcd(int a,int b){
17        return a!=0?gcd(b%a,a):Math.abs(b);
18    }
19}