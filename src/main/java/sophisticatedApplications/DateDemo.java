package sophisticatedApplications;

/*
 * 	D	一年中的第几天
 * 	d	一月中的第几天
 *  E	星期中的第几天
 *  y	年
 *  H	小时(0-24)
 *  h	小时(0-12)
 *  M	月份
 *  m	分钟
 *  s	秒
 *  S	毫秒
 *
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        Date now = new Date(2019, 9, 2);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf1.format(now));
        System.out.println("两天前的日期：" + sdf1.format(new Date(now.getTime() - 2 * 24 * 60 * 60 * 1000)));
        System.out.println("三天后的日期：" + sdf1.format(new Date(now.getTime() + 3 * 24 * 60 * 60 * 1000)));

        SimpleDateFormat sdf2 = new SimpleDateFormat
                ("现在是yyyy年MM月dd日，时今年的第D天");
        System.out.println(sdf2.format(now));


        //创建一个代表2009年6月12日的Calendar对象
        Calendar calendar = Calendar.getInstance();
        calendar.set(2009, 6 - 1, 12);
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);//让日期加1  
        System.out.println(calendar.get(Calendar.DATE));//加1之后的日期Top



        GregorianCalendar gcalendar = new GregorianCalendar();
        // 测试当前年份是否为闰年
        if (gcalendar.isLeapYear(gcalendar.get(Calendar.YEAR))) System.out.println("当前年份是闰年");
        else System.out.println("当前年份不是闰年");
        gcalendar.setTime( new SimpleDateFormat("yyyyMMdd").parse("20090902"));
        gcalendar.add(5, -Integer.parseInt("7"));
        System.out.println(new SimpleDateFormat("yyyyMMdd").format(gcalendar.getTime()));
        /*
         *java中对日期的加减操作
         *gc.add(1,-1)表示年份减一.
         *gc.add(2,-1)表示月份减一.
         *gc.add(3.-1)表示周减一.
         *gc.add(5,-1)表示天减一.
         *以此类推应该可以精确的毫秒吧.没有再试.大家可以试试.
         *GregorianCalendar类的add(int field,int amount)方法表示年月日加减.
         *field参数表示年,月.日等.
         *amount参数表示要加减的数量.
         */


    }

}
