package me.ponco.recipeapps.Data;

import java.util.ArrayList;

import me.ponco.recipeapps.Adapter.RecipeAdapter;

public class RecipeData {
    public static String[][] data = new String[][]{
            {"Udang Goreng Tepung", "Masakan Rumahan",
                    "https://cdns.klimg.com/vemale.com/headline/650x325/2017/01/resep-udang-goreng-tepung-gurih-dan-renyah.jpg",
                    "1.\tTaburi udang dengan garam dan merica dan diamkan selama 15 menit\n" +
                            "2.\tCampur bahan celupan yang telah disiapkan dan aduk merata\n" +
                            "3.\tMasukkan udang ke dalam bahan celupan lalu gulingkan dalam tepung panir kasar\n" +
                            "4.\tPanaskan minyak, goreng udang hingga warna berubah kekuningan.\n" +
                            "5.\tAngkat lalu tiriskan. Sajikan dengan saus tomat atau saus sambal.\n" +
                            ""
            },
            {
                    "Kroket Udang", "Makan Siang",
                    "http://cdn.klimg.com/vemale.com/headline/650x325/2014/02/resep-kroket-keju-daging-asap.jpg",
                    "•\tCampur udang, kentang, wortel, seledri, telur, bubuk merica, garam dan bumbu halus, aduk hingga rata.\n" +
                            "•\tAmbil 2 sdm adonan, bentuk lonjong. Lakukan hingga adonan habis. Celupkan kroket ke dalam telur, angkat. Gulingkan ke dalam tepung panir hingga terbalut rata. Sisihkan.\n" +
                            "•\tPanaskan minyak, goreng kroket hingga kecokelatan dan matang. Angkat.\n"
            },
            {
                    "Telur Dadar Campur", "Makan Malam",
                    "http://resephariini.com/wp-content/uploads/2015/06/telur-dadar-padang.jpg",
                    "1.\tKocok semua bahan menjadi satu.\n" +
                            "2.\tPanaskan minyak, masukkan adonan dan ratakan. Masak hingga setengah matang dan gulung. Bolak-balik hingga matang. Angkat dan hidangkan\n"
            }
    };

    public static ArrayList<RecipeAdapter> getListData() {
        RecipeAdapter bg = null;
        ArrayList<RecipeAdapter> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bg = new RecipeAdapter();
            bg.setName(data[i][0]);
            bg.setDesc(data[i][1]);
            bg.setPhoto(data[i][2]);
            bg.setRecipe(data[i][3]);


            list.add(bg);
        }

        return list;
    }

}
