package ew;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25948h;

    /* JADX WARN: Code duplicated, block: B:101:0x0155  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x0179  */
    /* JADX WARN: Code duplicated, block: B:113:0x017f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0199  */
    /* JADX WARN: Code duplicated, block: B:144:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #8 {all -> 0x0054, blocks: (B:7:0x001e, B:8:0x0027, B:9:0x002d, B:10:0x0033, B:11:0x0039, B:12:0x003f, B:13:0x0045, B:14:0x004b, B:50:0x008e, B:53:0x0093), top: B:133:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0131  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x0151  */
    public e() throws Throwable {
        InputStream inputStreamOpen;
        String property;
        String property2;
        String property3;
        String property4;
        String property5;
        String property6;
        String property7;
        String property8;
        if (o.f44007a == null) {
            throw new IllegalStateException("Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first.");
        }
        System.currentTimeMillis();
        Properties properties = new Properties();
        InputStream inputStream = null;
        String str = null;
        try {
            inputStreamOpen = o.f44007a.getAssets().open("filedownloader.properties");
            if (inputStreamOpen != null) {
                try {
                    try {
                        properties.load(inputStreamOpen);
                        property = properties.getProperty("http.lenient");
                        try {
                            property2 = properties.getProperty("process.non-separate");
                            try {
                                property3 = properties.getProperty("download.min-progress-step");
                                try {
                                    property4 = properties.getProperty("download.min-progress-time");
                                    try {
                                        property5 = properties.getProperty("download.max-network-thread-count");
                                        try {
                                            property6 = properties.getProperty("file.non-pre-allocation");
                                            try {
                                                property7 = properties.getProperty("broadcast.completed");
                                                try {
                                                    property8 = properties.getProperty("download.trial-connection-head-method");
                                                    str = property;
                                                } catch (IOException e8) {
                                                    e = e8;
                                                    if (!(e instanceof FileNotFoundException)) {
                                                        e.printStackTrace();
                                                    }
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (IOException e10) {
                                                            e10.printStackTrace();
                                                        }
                                                    }
                                                    property8 = null;
                                                    str = property;
                                                }
                                            } catch (IOException e11) {
                                                e = e11;
                                                property7 = null;
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            property6 = null;
                                            property7 = property6;
                                            if (!(e instanceof FileNotFoundException)) {
                                                e.printStackTrace();
                                            }
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                            property8 = null;
                                            str = property;
                                            if (str == null) {
                                                if (str.equals("true")) {
                                                }
                                                this.f25943c = str.equals("true");
                                            } else {
                                                this.f25943c = false;
                                            }
                                            if (property2 == null) {
                                                if (property2.equals("true")) {
                                                }
                                                this.f25944d = property2.equals("true");
                                            } else {
                                                this.f25944d = false;
                                            }
                                            if (property3 != null) {
                                                this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                                            } else {
                                                this.f25941a = 65536;
                                            }
                                            if (property4 != null) {
                                                this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                                            } else {
                                                this.f25942b = 2000L;
                                            }
                                            if (property5 != null) {
                                                this.f25945e = a(Integer.valueOf(property5).intValue());
                                            } else {
                                                this.f25945e = 3;
                                            }
                                            if (property6 == null) {
                                                if (property6.equals("true")) {
                                                }
                                                this.f25946f = property6.equals("true");
                                            } else {
                                                this.f25946f = false;
                                            }
                                            if (property7 == null) {
                                                if (property7.equals("true")) {
                                                }
                                                this.f25947g = property7.equals("true");
                                            } else {
                                                this.f25947g = false;
                                            }
                                            if (property8 == null) {
                                                this.f25948h = false;
                                            } else {
                                                if (property8.equals("true")) {
                                                }
                                                this.f25948h = property8.equals("true");
                                            }
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        property5 = null;
                                        property6 = property5;
                                        property7 = property6;
                                        if (!(e instanceof FileNotFoundException)) {
                                            e.printStackTrace();
                                        }
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                        property8 = null;
                                        str = property;
                                        if (str == null) {
                                            if (str.equals("true")) {
                                            }
                                            this.f25943c = str.equals("true");
                                        } else {
                                            this.f25943c = false;
                                        }
                                        if (property2 == null) {
                                            if (property2.equals("true")) {
                                            }
                                            this.f25944d = property2.equals("true");
                                        } else {
                                            this.f25944d = false;
                                        }
                                        if (property3 != null) {
                                            this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                                        } else {
                                            this.f25941a = 65536;
                                        }
                                        if (property4 != null) {
                                            this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                                        } else {
                                            this.f25942b = 2000L;
                                        }
                                        if (property5 != null) {
                                            this.f25945e = a(Integer.valueOf(property5).intValue());
                                        } else {
                                            this.f25945e = 3;
                                        }
                                        if (property6 == null) {
                                            if (property6.equals("true")) {
                                            }
                                            this.f25946f = property6.equals("true");
                                        } else {
                                            this.f25946f = false;
                                        }
                                        if (property7 == null) {
                                            if (property7.equals("true")) {
                                            }
                                            this.f25947g = property7.equals("true");
                                        } else {
                                            this.f25947g = false;
                                        }
                                        if (property8 == null) {
                                            this.f25948h = false;
                                        } else {
                                            if (property8.equals("true")) {
                                            }
                                            this.f25948h = property8.equals("true");
                                        }
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    property4 = null;
                                    property5 = property4;
                                    property6 = property5;
                                    property7 = property6;
                                    if (!(e instanceof FileNotFoundException)) {
                                        e.printStackTrace();
                                    }
                                    if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                    property8 = null;
                                    str = property;
                                    if (str == null) {
                                        if (str.equals("true")) {
                                        }
                                        this.f25943c = str.equals("true");
                                    } else {
                                        this.f25943c = false;
                                    }
                                    if (property2 == null) {
                                        if (property2.equals("true")) {
                                        }
                                        this.f25944d = property2.equals("true");
                                    } else {
                                        this.f25944d = false;
                                    }
                                    if (property3 != null) {
                                        this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                                    } else {
                                        this.f25941a = 65536;
                                    }
                                    if (property4 != null) {
                                        this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                                    } else {
                                        this.f25942b = 2000L;
                                    }
                                    if (property5 != null) {
                                        this.f25945e = a(Integer.valueOf(property5).intValue());
                                    } else {
                                        this.f25945e = 3;
                                    }
                                    if (property6 == null) {
                                        if (property6.equals("true")) {
                                        }
                                        this.f25946f = property6.equals("true");
                                    } else {
                                        this.f25946f = false;
                                    }
                                    if (property7 == null) {
                                        if (property7.equals("true")) {
                                        }
                                        this.f25947g = property7.equals("true");
                                    } else {
                                        this.f25947g = false;
                                    }
                                    if (property8 == null) {
                                        this.f25948h = false;
                                    } else {
                                        if (property8.equals("true")) {
                                        }
                                        this.f25948h = property8.equals("true");
                                    }
                                }
                            } catch (IOException e15) {
                                e = e15;
                                property3 = null;
                                property4 = property3;
                                property5 = property4;
                                property6 = property5;
                                property7 = property6;
                                if (!(e instanceof FileNotFoundException)) {
                                    e.printStackTrace();
                                }
                                if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                property8 = null;
                                str = property;
                                if (str == null) {
                                    if (str.equals("true")) {
                                    }
                                    this.f25943c = str.equals("true");
                                } else {
                                    this.f25943c = false;
                                }
                                if (property2 == null) {
                                    if (property2.equals("true")) {
                                    }
                                    this.f25944d = property2.equals("true");
                                } else {
                                    this.f25944d = false;
                                }
                                if (property3 != null) {
                                    this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                                } else {
                                    this.f25941a = 65536;
                                }
                                if (property4 != null) {
                                    this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                                } else {
                                    this.f25942b = 2000L;
                                }
                                if (property5 != null) {
                                    this.f25945e = a(Integer.valueOf(property5).intValue());
                                } else {
                                    this.f25945e = 3;
                                }
                                if (property6 == null) {
                                    if (property6.equals("true")) {
                                    }
                                    this.f25946f = property6.equals("true");
                                } else {
                                    this.f25946f = false;
                                }
                                if (property7 == null) {
                                    if (property7.equals("true")) {
                                    }
                                    this.f25947g = property7.equals("true");
                                } else {
                                    this.f25947g = false;
                                }
                                if (property8 == null) {
                                    this.f25948h = false;
                                } else {
                                    if (property8.equals("true")) {
                                    }
                                    this.f25948h = property8.equals("true");
                                }
                            }
                        } catch (IOException e16) {
                            e = e16;
                            property2 = null;
                            property3 = property2;
                            property4 = property3;
                            property5 = property4;
                            property6 = property5;
                            property7 = property6;
                            if (!(e instanceof FileNotFoundException)) {
                                e.printStackTrace();
                            }
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            property8 = null;
                            str = property;
                            if (str == null) {
                                if (str.equals("true")) {
                                }
                                this.f25943c = str.equals("true");
                            } else {
                                this.f25943c = false;
                            }
                            if (property2 == null) {
                                if (property2.equals("true")) {
                                }
                                this.f25944d = property2.equals("true");
                            } else {
                                this.f25944d = false;
                            }
                            if (property3 != null) {
                                this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                            } else {
                                this.f25941a = 65536;
                            }
                            if (property4 != null) {
                                this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                            } else {
                                this.f25942b = 2000L;
                            }
                            if (property5 != null) {
                                this.f25945e = a(Integer.valueOf(property5).intValue());
                            } else {
                                this.f25945e = 3;
                            }
                            if (property6 == null) {
                                if (property6.equals("true")) {
                                }
                                this.f25946f = property6.equals("true");
                            } else {
                                this.f25946f = false;
                            }
                            if (property7 == null) {
                                if (property7.equals("true")) {
                                }
                                this.f25947g = property7.equals("true");
                            } else {
                                this.f25947g = false;
                            }
                            if (property8 == null) {
                                this.f25948h = false;
                            } else {
                                if (property8.equals("true")) {
                                }
                                this.f25948h = property8.equals("true");
                            }
                        }
                    } catch (IOException e17) {
                        e = e17;
                        property = null;
                        property2 = property;
                        property3 = property2;
                        property4 = property3;
                        property5 = property4;
                        property6 = property5;
                        property7 = property6;
                        if (!(e instanceof FileNotFoundException)) {
                            e.printStackTrace();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        property8 = null;
                        str = property;
                        if (str == null) {
                            if (str.equals("true")) {
                            }
                            this.f25943c = str.equals("true");
                        } else {
                            this.f25943c = false;
                        }
                        if (property2 == null) {
                            if (property2.equals("true")) {
                            }
                            this.f25944d = property2.equals("true");
                        } else {
                            this.f25944d = false;
                        }
                        if (property3 != null) {
                            this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
                        } else {
                            this.f25941a = 65536;
                        }
                        if (property4 != null) {
                            this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
                        } else {
                            this.f25942b = 2000L;
                        }
                        if (property5 != null) {
                            this.f25945e = a(Integer.valueOf(property5).intValue());
                        } else {
                            this.f25945e = 3;
                        }
                        if (property6 == null) {
                            if (property6.equals("true")) {
                            }
                            this.f25946f = property6.equals("true");
                        } else {
                            this.f25946f = false;
                        }
                        if (property7 == null) {
                            if (property7.equals("true")) {
                            }
                            this.f25947g = property7.equals("true");
                        } else {
                            this.f25947g = false;
                        }
                        if (property8 == null) {
                            this.f25948h = false;
                        } else {
                            if (property8.equals("true")) {
                            }
                            this.f25948h = property8.equals("true");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e18) {
                            e18.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                property8 = null;
                property2 = null;
                property3 = null;
                property4 = null;
                property5 = null;
                property6 = null;
                property7 = null;
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e19) {
                    e19.printStackTrace();
                }
            }
        } catch (IOException e21) {
            e = e21;
            inputStreamOpen = null;
            property = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        if (str == null) {
            this.f25943c = false;
        } else {
            if (str.equals("true") && !str.equals("false")) {
                int i11 = f.f25949a;
                Locale locale = Locale.ENGLISH;
                throw new IllegalStateException("the value of 'http.lenient' must be 'true' or 'false'");
            }
            this.f25943c = str.equals("true");
        }
        if (property2 == null) {
            this.f25944d = false;
        } else {
            if (property2.equals("true") && !property2.equals("false")) {
                int i12 = f.f25949a;
                Locale locale2 = Locale.ENGLISH;
                throw new IllegalStateException("the value of 'process.non-separate' must be 'true' or 'false'");
            }
            this.f25944d = property2.equals("true");
        }
        if (property3 != null) {
            this.f25941a = Math.max(0, Integer.valueOf(property3).intValue());
        } else {
            this.f25941a = 65536;
        }
        if (property4 != null) {
            this.f25942b = Math.max(0L, Long.valueOf(property4).longValue());
        } else {
            this.f25942b = 2000L;
        }
        if (property5 != null) {
            this.f25945e = a(Integer.valueOf(property5).intValue());
        } else {
            this.f25945e = 3;
        }
        if (property6 == null) {
            this.f25946f = false;
        } else {
            if (property6.equals("true") && !property6.equals("false")) {
                int i13 = f.f25949a;
                Locale locale3 = Locale.ENGLISH;
                throw new IllegalStateException("the value of 'file.non-pre-allocation' must be 'true' or 'false'");
            }
            this.f25946f = property6.equals("true");
        }
        if (property7 == null) {
            this.f25947g = false;
        } else {
            if (property7.equals("true") && !property7.equals("false")) {
                int i14 = f.f25949a;
                Locale locale4 = Locale.ENGLISH;
                throw new IllegalStateException("the value of 'broadcast.completed' must be 'true' or 'false'");
            }
            this.f25947g = property7.equals("true");
        }
        if (property8 == null) {
            this.f25948h = false;
        } else if (!property8.equals("true") || property8.equals("false")) {
            this.f25948h = property8.equals("true");
        } else {
            int i15 = f.f25949a;
            Locale locale5 = Locale.ENGLISH;
            throw new IllegalStateException("the value of 'download.trial-connection-head-method' must be 'true' or 'false'");
        }
    }

    public static int a(int i11) {
        if (i11 > 12) {
            o00.a.P(e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i11), 12, 12);
            return 12;
        }
        if (i11 >= 1) {
            return i11;
        }
        o00.a.P(e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i11), 1, 1);
        return 1;
    }
}
