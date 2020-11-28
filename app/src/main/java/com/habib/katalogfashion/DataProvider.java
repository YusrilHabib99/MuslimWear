package com.habib.katalogfashion;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.habib.katalogfashion.model.Muslim;
import com.habib.katalogfashion.model.Muslimah;
import com.habib.katalogfashion.model.Fashion;

public class DataProvider {
    private static List<Fashion> fashions = new ArrayList<>();

    private static List<Muslim> initDataMuslim(Context ctx) {
        List<Muslim> muslims = new ArrayList<>();
        muslims.add(new Muslim("Guy Laroche","Rp. 499.500",
                "- Warna putih\n" +
                "- Kerah mandarin\n" +
                "- Unlined\n" +
                "- Regular fit\n" +
                "- Kancing depan\n" +
                "- Material katun tidak transparan, ringan, dan tidak stretch\n" +
                "- Full size\n",R.drawable.lk_1));
        muslims.add(new Muslim("Emba Jeans","Rp. 159.000",
                "- Warna putih\n" +
                        "- Kerah tinggi\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- 1 kantong depan\n" +
                        "- Material katun, tidak transparan, ringan dan tidak stretch\n" +
                        "- All Size\n",R.drawable.lk_2));
        muslims.add(new Muslim("Emba Jeans","Rp. 140.000",
                "- Warna biru\n" +
                        "- Kerah tinggi\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- Kantong depan\n" +
                        "- Material katun tidak transparan, ringan dan tidak stretch\n" +
                        "- Ukuran : XS, S, L, XL\n",R.drawable.lk_3));
        muslims.add(new Muslim("Manly","Rp. 269.000",
                "- Regular fit \n" +
                        "- Kerah Shanghai\n" +
                        "- Katun Kombinasi\n" +
                        "- Koko\n" +
                        "- Motif tidak pudar\n" +
                        "- Size : M, L, XL\n",R.drawable.lk_4));
        muslims.add(new Muslim("Jobb","Rp. 179.000",
                "- Baju Koko Kurta\n" +
                        "- Security Pocket di bagian samping\n" +
                        "- Mandarin Collar\n" +
                        "- 3 Kancing depan\n" +
                        "- Regular Fit\n" +
                        "- Material 100% Polyester\n" +
                        "- Warna Grey\n" +
                        "- All Size\n",R.drawable.lk_5));
        muslims.add(new Muslim("Izzue","Rp. 191.000",
                "- Baju koko lengan panjang detail tekstur\n" +
                        "- Warna putih\n" +
                        "- Kerah mandarin\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- Material katun\n" +
                        "- All Size\n",R.drawable.lk_6));
        return muslims;
    }

    private static  List<Muslimah> initDataMuslimah(Context ctx) {
        List<Muslimah> muslimahs = new ArrayList<>();
        muslimahs.add(new Muslimah("Simplicity","Rp. 839.000",
                "- Warna hitam\n" +
                        "- Kerah bulat\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Kancing depan\n" +
                        "- Material poliester kombinasi tidak transparan\n" +
                        "- All Size\n",R.drawable.pr_1));
        muslimahs.add(new Muslimah("Wandakiah.id","Rp.285.000",
                "- Bahan itycrepe street\n" +
                        "- Terdapat sleting di bagian depan sehingga busui friendly.\n" +
                        "- Renda yang dipakai adalah rajut berwarna putih.\n" +
                        "- Pada saku kiri dan kanan terdapat aplikasi renda\n",R.drawable.pr_2));
        muslimahs.add(new Muslimah("Hijabenka","Rp. 314.000",
                "Tampilan feminin dengan dress cantik yang cocok kamu padankan dengan hijab warna senaa serta heels favoritmu. All size",R.drawable.pr_3));
        muslimahs.add(new Muslimah("Le Najwa","Rp. 165.000",
                "- Long dres desain mock two piece detail lipit\n" +
                        "- Kombinasi warna navy dan putih\n" +
                        "- Kerah bulat\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Resleting\n" +
                        "- Material crepe tidak transparan, ringan dan tidak stretch\n"+
                        "- All Size",R.drawable.pr_4));
        muslimahs.add(new Muslimah("Aira Muslim Butik","Rp. 208.000",
                "- Home dress desain flare sleeve dalam paduan warna yang lembut\n" +
                        "- Warna biru\n" +
                        "- Kerah bulat\n" +
                        "- Regular fit\n" +
                        "- Material rayon tidak transparan, ringan, dan tidak stretch\n" +
                        "- All Size",R.drawable.pr_5));
        muslimahs.add(new Muslimah("Azza","Rp. 359.000",
                "- Dress dengan aksen bunga untuk feminime chic look\n" +
                        "- Warna orange\n" +
                        "- Kerah bulat\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- All Size ",R.drawable.pr_6));
        return muslimahs;
    }

    private static void initAllFashions(Context ctx) {
        fashions.addAll(initDataMuslim(ctx));
        fashions.addAll(initDataMuslimah(ctx));
    }

    public static List<Fashion> getAllFashion(Context ctx) {
        if (fashions.size() == 0 ) {
            initAllFashions(ctx);
        }
        return fashions;
    }

    public static List<Fashion> getFashionsByTipe(Context ctx, String jenis) {
        List<Fashion> fashionsByType = new ArrayList<>();
        if (fashions.size() == 0 ) {
            initAllFashions(ctx);
        }
        for (Fashion f : fashions) {
            if (f.getJenis().equals(jenis)) {
                fashionsByType.add(f);
            }
        }
        return fashionsByType;
    }

}
