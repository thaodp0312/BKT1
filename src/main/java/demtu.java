public class demtu {

    String inhoa(String str) {
        String[] mang = str.split("\\s");
        StringBuilder[] mang2 = new StringBuilder[mang.length];
        StringBuilder xau = new StringBuilder();
        for (int i = 0; i < mang.length; i++) {
            mang2[i] = new StringBuilder(mang[i]);
            mang2[i] = mang2[i].replace(0, 1, Character.toString(mang[i].charAt(0)).toUpperCase());
            xau = xau.append(mang2[i]).append(" ");
        }
        return xau.toString().trim();
    }

    String chuyenkytu(String str) {

        String chuoi = str.toLowerCase();
        chuoi = chuoi.trim();
        chuoi = chuoi.replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder(chuoi);
        sb = sb.replace(0, 1, Character.toString(chuoi.charAt(0)).toUpperCase());
        int index = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (Character.toString(chuoi.charAt(i)).equals(".")) {
                index = i;
                sb = sb.replace(index + 2, index + 3, Character.toString(chuoi.charAt(i + 2)).toUpperCase());
            }
        }
        return sb.toString();
    }

    int sotu(String str){
        int dem = 0;
        for (int i = 0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                dem = dem +1;
            }
        } return dem;
    }

}
