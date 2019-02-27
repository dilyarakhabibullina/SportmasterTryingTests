package ru.itpark;

public class Wallpaper {
    public static void main(String[] args){
        int roomLength=5;
        int roomWidth=4;
        int roomHeight=3;
        int wallpaperWidth=2;
        int rollLength=5;
        int roomPerimetr=2*(roomLength+roomWidth);
        int piecesOfWallpaper=roomPerimetr/wallpaperWidth; //сколько полотнищ нужно для оклейки периметра комнаты//
        int piecesInOneRoll=rollLength/roomHeight;//сколько полотнищ в одном рулоне//
        int rollAmount=piecesOfWallpaper/piecesInOneRoll;
        System.out.println(rollAmount);
    }
}