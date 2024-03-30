package com.ifs21044.whatsapp

object ObjectPembaruan {
    // Arraylist and return the Arraylist
    fun getPembaruanData():ArrayList<Pembaruan>{
        // create an arraylist of type employee class
        val pembaruanList=ArrayList<Pembaruan>()
        val pem1=Pembaruan(R.drawable.ppicha,"Icha")
        pembaruanList.add(pem1)
        val pem2=Pembaruan(R.drawable.scoups,"Scoups")
        pembaruanList.add(pem2)
        val pem3=Pembaruan(R.drawable.suamiicha,"Mingyu")
        pembaruanList.add(pem3)
        val pem4=Pembaruan(R.drawable.ppkasih,"Kasih")
        pembaruanList.add(pem4)
        val pem5=Pembaruan(R.drawable.wondergirll,"Wonder")
        pembaruanList.add(pem5)
        return  pembaruanList
    }
}