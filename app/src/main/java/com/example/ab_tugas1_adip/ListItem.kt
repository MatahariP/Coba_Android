package com.example.ab_tugas1_adip

object ListItem {
    fun buatlist():ArrayList<RecyclerViewItemModel>{
        val daftarItem = ArrayList<RecyclerViewItemModel>()
        daftarItem.add(RecyclerViewItemModel(R.drawable.mcd, "McDonald's","Eskrimnya enak bang kata mama"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.kfc, "Kentucky Fried Chicken","Ayam spicynya enak kata bang andes"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.sabana, "Sabana","Andes suka beli sayap klo di upn"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.aw, "A&W","Kentangnya juaraa"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.bakmisejduk, "Sedjuk Bakmi & Kopi ","Kita bukber di sini bang"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.pizzahut, "Pizza Hut","Ini tempat pizza"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.dominopizza, "Domino's Pizza","Ini tempat pizza jugaa"))
        daftarItem.add(RecyclerViewItemModel(R.drawable.mixue, "Mixue","Aku murah dan enak bang"))
        return daftarItem
    }


}

//RecyclerViewItemModel(
//R.drawable.m1_abrams,
//"M1 Abrams",
//"M1 Abrams adalah tank tempur utama yang diproduksi" +
//" oleh Amerika Serikat, yang telah digunakan dalam berbagai " +
//"konflik militer sejak tahun 1980-an hingga saat ini. Tank ini" +
//" memiliki senjata yang efektif dan perlindungan yang kuat terhadap serangan musuh."))
//daftarItem.add(RecyclerViewItemModel(R.drawable.leopard,
//"Leopard 2",
//"Tank Leopard 2 adalah sebuah tank tempur utama yang dikembangkan oleh perusahaan Jerman," +
//" Krauss-Maffei Wegmann pada tahun 1970-an dan mulai digunakan oleh militer Jerman " +
//"pada tahun 1979. Tank ini telah diproduksi dan digunakan oleh banyak negara di seluruh" +
//" dunia. Leopard 2 memiliki kemampuan tempur yang tangguh dan telah mengalami beberapa " +
//"pengembangan untuk meningkatkan performa dan keandalannya."))
