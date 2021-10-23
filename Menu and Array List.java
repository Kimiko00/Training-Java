//VERSI 1
Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        List<Integer> coba = new ArrayList<>(); 
        
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tampil");
            System.out.println("2. Tambah");
            System.out.println("3. Hapus");
            System.out.println("4. Keluar");
            System.out.println("");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 : 
                    System.out.println("*******************************");
                    System.out.println("Menu Tampil");
                    System.out.println("*******************************");
                    for (int i = 0; i<coba.size(); i++) System.out.println(i+". "+coba.get(i));
                    if (coba.size() == 0) System.out.println("-TIDAK ADA DATA-");
                    System.out.println("*******************************");
                    input2.nextLine();
                    break;
                case 2 : 
                    System.out.println("*******************************");
                    System.out.println("Menu Tambah");
                    System.out.println("*******************************");
                    System.out.print("Masukkan Nilai : ");
                    coba.add(input.nextInt());
                    System.out.println("Sukses Tambah Data!");
                    System.out.println("*******************************");
                    input2.nextLine();
                    break;
                case 3 : 
                    System.out.println("*******************************");
                    System.out.println("Menu Hapus");
                    System.out.println("*******************************");
                    if (coba.size() == 0) {
                        System.out.println("-TIDAK ADA DATA-");
                    } else {
                        for (int i = 0; i<coba.size(); i++) System.out.println(i+". "+coba.get(i));
                        System.out.print("Masukkan Indeks Nilai yang ingin dihapus : ");
                        try {
                            int [] hapus = new int[2];
                            hapus[0] = input.nextInt();
                            hapus[1] = coba.get(hapus[0]);
                            coba.remove(hapus[0]);
                            System.out.println("Sukses Menghapus Indeks ke "+hapus[0]+" ("+hapus[1]+")");
                        } catch (Exception e) {
                            System.out.println("Error : "+e);
                        }
                    }
                    System.out.println("*******************************");
                    input2.nextLine();
                    break;
                default : 
                    System.exit(0);
            }
        }



//VERSI 2
Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        List<Integer> coba = new ArrayList<>(); 
        
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tampil");
            System.out.println("2. Tambah");
            System.out.println("3. Hapus");
            System.out.println("4. Keluar");
            System.out.println("");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();
            if (pilihan == 1) { 
                    System.out.println("*******************************");
                    System.out.println("Menu Tampil");
                    System.out.println("*******************************");
                    if (coba.size() == 0) {
                        System.out.println("-TIDAK ADA DATA-");
                    } else {
                        for (int i = 0; i<coba.size(); i++) {
                            System.out.println(i+". "+coba.get(i));
                        }
                    }
                    
                    System.out.println("*******************************");
                    input2.nextLine();
            } else if (pilihan == 2) { 
                    System.out.println("*******************************");
                    System.out.println("Menu Tambah");
                    System.out.println("*******************************");
                    System.out.print("Masukkan Nilai : ");
                    coba.add(input.nextInt());
                    System.out.println("Sukses Tambah Data!");
                    System.out.println("*******************************");
                    input2.nextLine();
            } else if (pilihan == 3) { 
                    System.out.println("*******************************");
                    System.out.println("Menu Hapus");
                    System.out.println("*******************************");
                    if (coba.size() == 0) {
                        System.out.println("-TIDAK ADA DATA-");
                    } else {
                        for (int i = 0; i<coba.size(); i++) {
                            System.out.println(i+". "+coba.get(i));
                        }
                        System.out.print("Masukkan Indeks Nilai yang ingin dihapus : ");
                        try {
                            int i = input.nextInt();
                            System.out.println("Sukses Menghapus Indeks ke "+i+" ("+coba.get(i)+")");
                            coba.remove(i);
                        } catch (Exception e) {
                            System.out.println("Error : "+e);
                        }
                    }
                    System.out.println("*******************************");
                    input2.nextLine();
            } else {
                    System.exit(0);
            }
        }
