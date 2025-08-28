package com.joysistvi.looping.forloop;

import java.util.Scanner;

public class LoadRegistrationWithLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to proceed to Load Registration");
        System.out.print("Enter numbers:");
        String dial = scanner.nextLine();

        if (dial.equals("*143#")) {
            System.out.println("\n\tLoad Registration");
            System.out.println("[1] NEW ALLSURF99");
            System.out.println("[2] NEW PawerSURF");
            System.out.println("[3] EasySURF");
            System.out.println("[4] All-Net SURF");
            System.out.print("Enter your chosen number:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n\t9GB data + 7GB(1GB/day) for FUNALIW apps");
                System.out.println("(FB, YouTube, ML, TikTok, atbp.) + unli all-net  texts.");
                System.out.println("\t[1] Register");
                System.out.println("\t[2] Stop");
                System.out.println("\t[3] Back");
                System.out.print("Enter your chosen number:");
                int NEWALLSURF99 = scanner.nextInt();

                if (NEWALLSURF99 == 1) {
                    System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                    System.out.println("makalipas ang ilang sandali.");

                } else if (NEWALLSURF99 == 2) {
                    System.out.println("\nSalamat!");

                }
            } else if (choice == 2) {
                System.out.println("\n*\t[1] NEW PawerSURF 30");
                System.out.println("\t[2] NEW PawerSURF 20");
                System.out.println("\t[3] PawerSURF99");
                System.out.println("\t[4] Back");
                System.out.print("Enter your chosen number:");
                int NEWPawerSURF = scanner.nextInt();

                if (NEWPawerSURF == 1) {
                    System.out.println("\n2GB data (1GB pang-internet, 1GB FunALIW apps) at UNLI");
                    System.out.println("calls & texts to all networks, P30 for 2 days!");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Status");
                    System.out.println("\t[3] Stop");
                    System.out.println("\t[4] Back");
                    System.out.print("Enter your chosen number:");
                    int NEWPawerSURF30 = scanner.nextInt();

                    if (NEWPawerSURF30 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (NEWPawerSURF30 == 2) {
                        System.out.println("Salamat!");
                    }
                } else if (NEWPawerSURF == 2) {
                    System.out.println("\n1GB pang-internet at 250 mins calls & 250 texts to all");
                    System.out.println("networks, P20 for 1 day!");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Status");
                    System.out.println("\t[3] Stop");
                    System.out.println("\t[4] Back");
                    System.out.print("Enter your chosen number:");
                    int NEWPawerSURF20 = scanner.nextInt();

                    if (NEWPawerSURF20 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (NEWPawerSURF20 == 2) {
                        System.out.println("\nSalamat!");
                    }

                } else if (NEWPawerSURF == 3) {
                    System.out.println("\n5 days ng UNLI all-net calls & texts at 6GB data, P99 lang!");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Status");
                    System.out.println("\t[3] Stop");
                    System.out.println("\t[4] Back");
                    System.out.println("\t[5] Bookmark");
                    System.out.print("Enter your chosen number:");
                    int NewPawerSURF30 = scanner.nextInt();

                    if (NewPawerSURF30 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (NewPawerSURF30 == 2) {
                        System.out.println("Salamat!");
                    }
                }

            } else if (choice == 3) {
                System.out.println("\nMobile data + your choice of freebie!");
                System.out.println("\t[1] EasySURF50");
                System.out.println("\t[2] EZ75 w/ All-Net");
                System.out.println("\t[3] EZ90");
                System.out.println("\t[4] EZ99 (16GB)");
                System.out.println("\t[5] EZ110 (18GB)");
                System.out.print("Enter your chosen number:");
                int EasySURF = scanner.nextInt();

                if (EasySURF == 1) {
                    System.out.println("\n6GB+Unli ALLNET texts, 3days");
                    System.out.println("\t[1] EZ50 FunALIW");
                    System.out.println("\t[2] EZ50 FunACHIEVE");
                    System.out.println("\t[3] FREE EXTEND");
                    System.out.println("\t[4] Back");
                    System.out.print("Enter your chosen number:");
                    int EasySURF1 = scanner.nextInt();

                    if (EasySURF1 == 1) {
                        System.out.println("\n3GB data+3GB (1GB/day) for FunALIW apps");
                        System.out.println("(FB, YT, ML, TikTok, atbp.)");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] 2GB+6GB (2GB/day) pag sa Naw GlobeOne App!");
                        System.out.println("\t[3] Status");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunALIW50 = scanner.nextInt();

                        if (FunALIW50 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW50 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }

                    } else if (EasySURF1 == 2) {
                        System.out.println("\n3GB data+3GB(1GB/day) for FunACHIEVE apps");
                        System.out.println("(Google Meet, MS Teams, Zoom, Instagram, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] 2GB+6GB (2GB/day) pag sa New GlobeOne App!");
                        System.out.println("\t[3] Next");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunACHIEVE50 = scanner.nextInt();

                        if (FunACHIEVE50 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE50 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }

                    } else if (EasySURF1 == 3) {
                        System.out.println("\nExtra 1 day validty para sa 3GB data ng iyong active EZ50 registration");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Back");
                        System.out.print("Enter your chosen number:");
                        int FREEEXTEND = scanner.nextInt();

                        if (FREEEXTEND == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FREEEXTEND == 2) {
                            System.out.println("\nHindi registered sa kahit anung promo");
                        }
                    }

                } else if (EasySURF == 2) {
                    System.out.println("\n2GB data, 6GB apps, unli ALLNET calls&texts, P75/3days");
                    System.out.println("\t[1] EZ75 FunALIW");
                    System.out.println("\t[2] EZ75 FunACHIEVE");
                    System.out.println("\t[3] Back");
                    System.out.print("Enter your chosen number:");
                    int EasySURF2 = scanner.nextInt();

                    if (EasySURF2 == 1) {
                        System.out.println("\nUnli ALLNET calls & texts + 2GB data + 6GB (2GB/day) for");
                        System.out.println("FunALIW apps (FB, YouTube, ML, TikTok, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunALIW75 = scanner.nextInt();

                        if (FunALIW75 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW75 == 2) {
                            System.out.println("\nHindi registered sa kahit anung promo");
                        }
                    } else if (EasySURF2 == 2) {
                        System.out.println("\nUnli ALLNET calls & texts + 2GB data + 6GB (2GB/day) for");
                        System.out.println("FunACHIEVE apps (Google Meet, MS Teams, Zoom, Instagram, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunACHIEVE75 = scanner.nextInt();

                        if (FunACHIEVE75 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE75 == 2) {
                            System.out.println("\nHindi registered sa kahit anung promo");
                        }
                    }

                } else if (EasySURF == 3) {
                    System.out.println("\n2GB data, 7GB apps, unli ALLNET texts, P90/7days");
                    System.out.println("\t[1] EZ90 FunALIW");
                    System.out.println("\t[2] EZ90 FunACHIEVE");
                    System.out.println("\t[3] Back");
                    System.out.print("Enter your chosen number:");
                    int EasySURF3 = scanner.nextInt();

                    if (EasySURF3 == 1) {
                        System.out.println("\n2GB + 7GB (1GB araw-araw) for FunALIW apps");
                        System.out.println("(Facebook, YouTube, Mobile Legends, Tiktok, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Next");
                        System.out.println("\t[3] Back");
                        System.out.print("Enter your chosen number:");
                        int FunALIW90 = scanner.nextInt();

                        if (FunALIW90 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW90 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    } else if (EasySURF3 == 2) {
                        System.out.println("\n2GB + 7GB (1GB araw-araw) for FunACHIEVE apps");
                        System.out.println("(Google Learning/Meet, MS Teams, Zoom, Instagram, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Next");
                        System.out.println("\t[3] Back");
                        System.out.print("Enter your chosen number:");
                        int FunACHIEVE90 = scanner.nextInt();

                        if (FunACHIEVE90 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE90 == 2) {
                            System.out.println("Salamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    }

                } else if (EasySURF == 4) {
                    System.out.println("\n2GB data, 14GB apps (2GB/day), P99/7 days");
                    System.out.println("\t[1] EZ99 FunALIW");
                    System.out.println("\t[2] EZ99 FunACHIEVE");
                    System.out.println("\t[3] EZ99 W/ 5G Access");
                    System.out.println("\t[4] Back");
                    System.out.print("Enter your chosen number:");
                    int EasySURF4 = scanner.nextInt();

                    if (EasySURF4 == 1) {
                        System.out.println("\n2GB data + 14GB (2GB araw-araw) for FunALIW apps");
                        System.out.println("(Facebook, YouTube, Mobile Legends, Tiktok, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] May P9 off pag sa New GlobeOne App");
                        System.out.println("\t[3] Next");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunALIW99 = scanner.nextInt();

                        if (FunALIW99 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW99 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW99 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    } else if (EasySURF4 == 2) {
                        System.out.println("\n2GB data + 14GB (2GB araw-araw) for FunACHIEVE apps");
                        System.out.println("(Google Learning, MS Teams, Zoom, Instagram, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] May P9 off pag sa New GlobeOne App");
                        System.out.println("\t[3] Next");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunACHIEVE99 = scanner.nextInt();

                        if (FunACHIEVE99 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE99 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE99 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    } else if (EasySURF4 == 4) {
                        System.out.println("\n2GB data + 14GB (2GB araw-araw) for 5GB access");
                        System.out.println("(para sa naka 5G-ready devices lamang");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int GAccess99 = scanner.nextInt();

                        if (GAccess99 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (GAccess99 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (GAccess99 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    }
                } else if (EasySURF == 5) {
                    System.out.println("\n4GB data, 14GB apps(2GB/day), Unli ALLNET texts, P110/7days");
                    System.out.println("\t[1] EZ110 FunALIW");
                    System.out.println("\t[2] EZ110 FunACHIEVE");
                    System.out.println("\t[3] EZ110 w/ 5G Access");
                    System.out.println("\t[4] Back");
                    System.out.print("Enter your chosen number:");
                    int EasySURF5 = scanner.nextInt();

                    if (EasySURF5 == 1) {
                        System.out.println("\n4GB data + 14GB (2GB araw-araw) for FunALIW apps");
                        System.out.println("(Facebook, YouTube, Mobile Legends, Tiktok, atbp.");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunALIW110 = scanner.nextInt();

                        if (FunALIW110 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW110 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunALIW110 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }

                    } else if (EasySURF5 == 2) {
                        System.out.println("\n4GB data + 14GB (2GB/day) for FunACHIEVE apps");
                        System.out.println("(Google Meet, MS Teams, Zoom, Instagram, atbp.)");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int FunACHIEVE110 = scanner.nextInt();

                        if (FunACHIEVE110 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE110 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (FunACHIEVE110 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }

                    } else if (EasySURF5 == 3) {
                        System.out.println("\n4GB data + 14GB(2GB araw-araw) for 5GB access");
                        System.out.println("(para sa naka 5G-ready device lamang");
                        System.out.println("\t[1] Register");
                        System.out.println("\t[2] Status");
                        System.out.println("\t[3] Stop");
                        System.out.println("\t[4] Back");
                        System.out.print("Enter your chosen number:");
                        int GAccess110 = scanner.nextInt();

                        if (GAccess110 == 1) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (GAccess110 == 2) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        } else if (GAccess110 == 3) {
                            System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                            System.out.println("makalipas ang ilang sandali.");
                        }
                    }
                }

            } else if (choice == 4) {
                System.out.println("\n\t[1] ALLSURF99");
                System.out.println("\t[2] ALLSURF110");
                System.out.println("\t[3] ALLSURF149");
                System.out.println("\t[4] Back");
                System.out.print("Enter your chosen number:");
                int AllNetSURF = scanner.nextInt();

                if (AllNetSURF == 1) {
                    System.out.println("\n9GB data +7GB(1GB/day) for FunALIW apps");
                    System.out.println("(FB, YouTube, ML, TikTok, atbp.)");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Stop");
                    System.out.println("\t[3] Back");
                    System.out.print("Enter your chosen number:");
                    int SURF99 = scanner.nextInt();

                    if (SURF99 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF99 == 2) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF99 == 3) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    }
                } else if (AllNetSURF == 2) {
                    System.out.println("\n10GB data + 7GB(1GB/day) for FUNALIW apps");
                    System.out.println("(FB, YouTube, ML, TikTok, atbp.)");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Stop");
                    System.out.println("\t[3] Back");
                    System.out.print("Enter your chosen number:");
                    int SURF110 = scanner.nextInt();

                    if (SURF110 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF110 == 2) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF110 == 3) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    }
                } else if (AllNetSURF == 3) {
                    System.out.println("\n12GB data + 7GB(1GB/day) for FunALIW apps");
                    System.out.println("(FB, YouTube, ML, TikTok, atbp.)");
                    System.out.println("\t[1] Register");
                    System.out.println("\t[2] Stop");
                    System.out.println("\t[3] Back");
                    System.out.print("Enter your chosen number:");
                    int SURF149 = scanner.nextInt();

                    if (SURF149 == 1) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF149 == 2) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    } else if (SURF149 == 3) {
                        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
                        System.out.println("makalipas ang ilang sandali.");
                    }

                }

            }
        } else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }

}
