package com.ifs21044.whatsapp

object ObjectPanggilan {
    // Arraylist and return the Arraylist
    fun getPanggilanData():ArrayList<Panggilan>{
        // create an arraylist of type employee class
        val panggilanList=ArrayList<Panggilan>()
        val pang1=Panggilan(R.drawable.ppkasih,"Kim Mingyu", "28 Maret 21.20", R.drawable.masuk, R.drawable.vc)
        panggilanList.add(pang1)
        val pang2=Panggilan(R.drawable.ppicha,"Ragil", "28 Maret 21.20", R.drawable.keluar, R.drawable.nelpon)
        panggilanList.add(pang2)



        return  panggilanList
    }
}