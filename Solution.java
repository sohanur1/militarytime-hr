public class Solution {
    static String timeConversions(String s){
        String time[]=s.split(":");
        String hour=time[0];
        String mins=time[1];
        String secAMPM=time[2];
        String seconds=secAMPM.substring(0,secAMPM.length()-2);
        String meridian=secAMPM.substring(secAMPM.length()-2);
        String militaryTime="";
        int hours=Integer.parseInt(hour);
        if((hours>=0 && hours<12) &&(meridian.equals("AM"))){
            militaryTime= String.format("%02d"+hours)+":"+mins+":"+seconds;

        }
        else if ((hours>=0 && hours<12) && (meridian.equals("PM"))){
            militaryTime=(hours+12)+":"+mins+":"+seconds;
        }
        else if((hours==12)&&(meridian.equals("AM"))){
            militaryTime="00"+":"+mins+":"+seconds;
        }
        else if((hours==12)&&(meridian.equals("PM"))){
            militaryTime=hours+":"+mins+":"+seconds;
        }
        return militaryTime;
    }
}
