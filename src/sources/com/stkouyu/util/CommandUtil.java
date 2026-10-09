package com.stkouyu.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class CommandUtil {
    public static final String COMMAND_EXIT = "exit\n";
    public static final String COMMAND_LINE_END = "\n";
    public static final String COMMAND_SH = "sh";
    private static final boolean ISDEBUG = true;
    public static final String TAG = "CommandUtil";

    private static void debug(String str) {
        MyLog.d(TAG, str);
    }

    public static int execute(String str) {
        return execute(new String[]{str});
    }

    /* JADX WARN: Code duplicated, block: B:109:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x016e A[Catch: IOException -> 0x016a, TryCatch #10 {IOException -> 0x016a, blocks: (B:106:0x0166, B:110:0x016e, B:112:0x0173), top: B:123:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0173 A[Catch: IOException -> 0x016a, TRY_LEAVE, TryCatch #10 {IOException -> 0x016a, blocks: (B:106:0x0166, B:110:0x016e, B:112:0x0173), top: B:123:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x011f A[Catch: IOException -> 0x011b, TryCatch #21 {IOException -> 0x011b, blocks: (B:76:0x0117, B:80:0x011f, B:82:0x0124), top: B:130:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0124 A[Catch: IOException -> 0x011b, TRY_LEAVE, TryCatch #21 {IOException -> 0x011b, blocks: (B:76:0x0117, B:80:0x011f, B:82:0x0124), top: B:130:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x012d A[PHI: r0 r1 r2 r3 r5 r6
      0x012d: PHI (r0v7 java.lang.StringBuilder) = (r0v6 java.lang.StringBuilder), (r0v9 java.lang.StringBuilder) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r2v7 java.io.DataOutputStream) = (r2v6 java.io.DataOutputStream), (r2v9 java.io.DataOutputStream) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r3v10 ??) = (r3v9 ??), (r3v12 ??) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r5v9 java.io.BufferedReader) = (r5v8 java.io.BufferedReader), (r5v11 java.io.BufferedReader) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r6v6 java.io.BufferedReader) = (r6v5 java.io.BufferedReader), (r6v8 java.io.BufferedReader) binds: [B:85:0x012b, B:101:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0141 A[Catch: IOException -> 0x013d, TryCatch #20 {IOException -> 0x013d, blocks: (B:92:0x0139, B:96:0x0141, B:98:0x0146), top: B:128:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0146 A[Catch: IOException -> 0x013d, TRY_LEAVE, TryCatch #20 {IOException -> 0x013d, blocks: (B:92:0x0139, B:96:0x0141, B:98:0x0146), top: B:128:0x0139 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static int execute(String[] strArr) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb2;
        ?? r9;
        ?? r11;
        BufferedReader bufferedReader2;
        StringBuilder sb3;
        ArrayList arrayList = new ArrayList();
        int iWaitFor = -1;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        ?? Exec = "execute command start : ";
        debug("execute command start : " + strArr);
        DataOutputStream dataOutputStream = null;
        try {
            try {
                Exec = Runtime.getRuntime().exec(COMMAND_SH);
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(Exec.getOutputStream());
                    try {
                        try {
                            for (String str : strArr) {
                                if (str != null) {
                                    dataOutputStream2.write(str.getBytes());
                                    dataOutputStream2.writeBytes("\n");
                                    dataOutputStream2.flush();
                                }
                            }
                            dataOutputStream2.writeBytes(COMMAND_EXIT);
                            dataOutputStream2.flush();
                            iWaitFor = Exec.waitFor();
                            sb3 = new StringBuilder();
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(Exec.getInputStream()));
                                try {
                                    bufferedReader2 = new BufferedReader(new InputStreamReader(Exec.getErrorStream()));
                                    while (true) {
                                        try {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            arrayList.add(line);
                                            debug(" command line item : " + line);
                                        } catch (IOException e8) {
                                            sb2 = sb3;
                                            e = e8;
                                            dataOutputStream = dataOutputStream2;
                                            Exec = Exec;
                                            e.printStackTrace();
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                    if (bufferedReader != null) {
                                                        bufferedReader.close();
                                                    }
                                                    if (bufferedReader2 != null) {
                                                        bufferedReader2.close();
                                                    }
                                                } catch (IOException e10) {
                                                    e10.printStackTrace();
                                                    if (Exec != 0) {
                                                        Exec.destroy();
                                                    }
                                                    sb3 = sb2;
                                                    debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                                                    return iWaitFor;
                                                }
                                            } else {
                                                if (bufferedReader != null) {
                                                    bufferedReader.close();
                                                }
                                                if (bufferedReader2 != null) {
                                                    bufferedReader2.close();
                                                }
                                            }
                                            if (Exec != 0) {
                                                Exec.destroy();
                                            }
                                            sb3 = sb2;
                                        } catch (Exception e11) {
                                            sb2 = sb3;
                                            e = e11;
                                            dataOutputStream = dataOutputStream2;
                                            Exec = Exec;
                                            e.printStackTrace();
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                    if (bufferedReader != null) {
                                                        bufferedReader.close();
                                                    }
                                                    if (bufferedReader2 != null) {
                                                        bufferedReader2.close();
                                                    }
                                                } catch (IOException e12) {
                                                    e12.printStackTrace();
                                                    if (Exec != 0) {
                                                        Exec.destroy();
                                                    }
                                                    sb3 = sb2;
                                                    debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                                                    return iWaitFor;
                                                }
                                            } else {
                                                if (bufferedReader != null) {
                                                    bufferedReader.close();
                                                }
                                                if (bufferedReader2 != null) {
                                                    bufferedReader2.close();
                                                }
                                            }
                                            if (Exec != 0) {
                                                Exec.destroy();
                                            }
                                            sb3 = sb2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                    if (bufferedReader != null) {
                                                        bufferedReader.close();
                                                    }
                                                    if (bufferedReader2 != null) {
                                                        bufferedReader2.close();
                                                    }
                                                } catch (IOException e13) {
                                                    e13.printStackTrace();
                                                    if (Exec == 0) {
                                                        throw th;
                                                    }
                                                    Exec.destroy();
                                                    throw th;
                                                }
                                            } else {
                                                if (bufferedReader != null) {
                                                    bufferedReader.close();
                                                }
                                                if (bufferedReader2 != null) {
                                                    bufferedReader2.close();
                                                }
                                            }
                                            if (Exec == 0) {
                                                throw th;
                                            }
                                            Exec.destroy();
                                            throw th;
                                        }
                                    }
                                    while (true) {
                                        String line2 = bufferedReader2.readLine();
                                        if (line2 != null) {
                                            sb3.append(line2);
                                        } else {
                                            try {
                                                break;
                                            } catch (IOException e14) {
                                                e14.printStackTrace();
                                            }
                                        }
                                    }
                                    dataOutputStream2.close();
                                    bufferedReader.close();
                                    bufferedReader2.close();
                                    Exec.destroy();
                                } catch (IOException e15) {
                                    sb2 = sb3;
                                    e = e15;
                                    bufferedReader2 = null;
                                } catch (Exception e16) {
                                    sb2 = sb3;
                                    e = e16;
                                    bufferedReader2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bufferedReader2 = null;
                                }
                            } catch (IOException e17) {
                                sb2 = sb3;
                                e = e17;
                                bufferedReader = null;
                                bufferedReader2 = bufferedReader;
                                dataOutputStream = dataOutputStream2;
                                Exec = Exec;
                                e.printStackTrace();
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                } else {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                }
                                if (Exec != 0) {
                                    Exec.destroy();
                                }
                                sb3 = sb2;
                                debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                                return iWaitFor;
                            } catch (Exception e18) {
                                sb2 = sb3;
                                e = e18;
                                bufferedReader = null;
                                bufferedReader2 = bufferedReader;
                                dataOutputStream = dataOutputStream2;
                                Exec = Exec;
                                e.printStackTrace();
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                } else {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                }
                                if (Exec != 0) {
                                    Exec.destroy();
                                }
                                sb3 = sb2;
                                debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                                return iWaitFor;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader = null;
                            bufferedReader2 = null;
                        }
                    } catch (IOException e19) {
                        e = e19;
                        sb2 = null;
                        bufferedReader = null;
                    } catch (Exception e21) {
                        e = e21;
                        sb2 = null;
                        bufferedReader = null;
                    }
                } catch (IOException e22) {
                    e = e22;
                    sb2 = null;
                    bufferedReader = null;
                    r11 = Exec;
                    bufferedReader2 = bufferedReader;
                    Exec = r11;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    } else {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    }
                    if (Exec != 0) {
                        Exec.destroy();
                    }
                    sb3 = sb2;
                    debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                    return iWaitFor;
                } catch (Exception e23) {
                    e = e23;
                    sb2 = null;
                    bufferedReader = null;
                    r9 = Exec;
                    bufferedReader2 = bufferedReader;
                    Exec = r9;
                    e.printStackTrace();
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    } else {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    }
                    if (Exec != 0) {
                        Exec.destroy();
                    }
                    sb3 = sb2;
                    debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
                    return iWaitFor;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                    Exec = Exec;
                    bufferedReader2 = bufferedReader;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    } else {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    }
                    if (Exec == 0) {
                        throw th;
                    }
                    Exec.destroy();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e24) {
            e = e24;
            sb2 = null;
            r11 = 0;
            bufferedReader = null;
        } catch (Exception e25) {
            e = e25;
            sb2 = null;
            r9 = 0;
            bufferedReader = null;
        } catch (Throwable th7) {
            th = th7;
            Exec = 0;
            bufferedReader = null;
        }
        debug(String.format(Locale.CHINA, "execute command end,errorMsg:%s,and status %d: ", sb3, Integer.valueOf(iWaitFor)));
        return iWaitFor;
    }
}
