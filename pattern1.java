public class pattern1 {
    public static void main(String[] args) {
        int n = 8;

        //s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || i == n - 1 || j == 0 && i < (n - 1) / 2 || i > (n - 1) / 2 && j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // H


            {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || i == (n - 1) / 2 || j == (n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("   ");
                // R


                {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || j == 0 || (i - j) == (n - 1) / 2 || i == (n - 1) / 2 || j == (n - 1) && i <= (n - 1) / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("   ");
                    //u


                    {
                        for (int j = 0; j < n; j++) {
                            if (j == 0 || i == n - 1 || j == n - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("   ");
                        //T


                        {
                            for (int j = 0; j < n; j++) {
                                if (j == (n - 1) / 2 || i == 0) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.print("   ");
                            // I


                            {
                                for (int j = 0; j < n; j++) {
                                    if (j == (n - 1) / 2 || i == 0 || i == n - 1) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }


                                System.out.print("                        ");


                                {
                                    for (int j = 0; j < n; j++) {
                                        if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                                            System.out.print("*");
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }

                                    System.out.print("   ");


                                    {
                                        for (int j = 0; j < n; j++) {
                                            if (j == 0 || i == (n - 1) / 2 || j == (n - 1)) {
                                                System.out.print("*");
                                            } else {
                                                System.out.print(" ");
                                            }
                                        }

                                        System.out.print("   ");
                                        //u


                                        {
                                            for (int j = 0; j < n; j++) {
                                                if (j == 0 || i == n - 1 || j == n - 1) {
                                                    System.out.print("*");
                                                } else {
                                                    System.out.print(" ");
                                                }
                                            }
                                            System.out.print("   ");

                                            {
                                                for (int j = 0; j < n; j++) {
                                                    if (i == 0 || i == (n - 1) / 2 || i == n - 1 || j == 0 && i < (n - 1) / 2 || i > (n - 1) / 2 && j == n - 1) {
                                                        System.out.print("*");
                                                    } else {
                                                        System.out.print(" ");
                                                    }
                                                }

                                                System.out.print("   ");
                                                // H


                                                {
                                                    for (int j = 0; j < n; j++) {
                                                        if (j == 0 || i == (n - 1) / 2 || j == (n - 1)) {
                                                            System.out.print("*");
                                                        } else {
                                                            System.out.print(" ");
                                                        }
                                                    }

                                                    System.out.print("   ");
                                                    // I


                                                    {
                                                        for (int j = 0; j < n; j++) {
                                                            if (j == (n - 1) / 2 || i == 0 || i == n - 1) {
                                                                System.out.print("*");
                                                            } else {
                                                                System.out.print(" ");
                                                            }
                                                        }

                                                        System.out.print("   ");
                                                        // I


                                                        {
                                                            for (int j = 0; j < n; j++) {
                                                                if (j == 0 || i == n - 1) {
                                                                    System.out.print("*");
                                                                } else {
                                                                    System.out.print(" ");
                                                                }
                                                            }


                                                            System.out.println(

                                                            );
                                                        }
                                                    }
                                                }

                                            }
                                        }
                                    }

                                }
                            }

                        }
                    }
                }
            }
        }
    }
}