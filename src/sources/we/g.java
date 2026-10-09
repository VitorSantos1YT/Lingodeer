package we;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f55111a = new g();

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:5:0x000d, B:7:0x0011, B:19:0x0035, B:21:0x003e, B:31:0x005a, B:41:0x0076, B:51:0x0091, B:65:0x00be, B:49:0x008b, B:39:0x0070, B:29:0x0054, B:17:0x002f, B:24:0x0049, B:44:0x0081, B:54:0x009b, B:57:0x00a5, B:59:0x00ab, B:62:0x00b2, B:11:0x001d, B:14:0x0027, B:34:0x0065), top: B:77:0x000d, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:5:0x000d, B:7:0x0011, B:19:0x0035, B:21:0x003e, B:31:0x005a, B:41:0x0076, B:51:0x0091, B:65:0x00be, B:49:0x008b, B:39:0x0070, B:29:0x0054, B:17:0x002f, B:24:0x0049, B:44:0x0081, B:54:0x009b, B:57:0x00a5, B:59:0x00ab, B:62:0x00b2, B:11:0x001d, B:14:0x0027, B:34:0x0065), top: B:77:0x000d, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:5:0x000d, B:7:0x0011, B:19:0x0035, B:21:0x003e, B:31:0x005a, B:41:0x0076, B:51:0x0091, B:65:0x00be, B:49:0x008b, B:39:0x0070, B:29:0x0054, B:17:0x002f, B:24:0x0049, B:44:0x0081, B:54:0x009b, B:57:0x00a5, B:59:0x00ab, B:62:0x00b2, B:11:0x001d, B:14:0x0027, B:34:0x0065), top: B:77:0x000d, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:54:0x009b, B:57:0x00a5, B:59:0x00ab, B:62:0x00b2), top: B:80:0x009b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:54:0x009b, B:57:0x00a5, B:59:0x00ab, B:62:0x00b2), top: B:80:0x009b, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final boolean b(View view) {
        boolean z11;
        boolean z12;
        TextView textView;
        boolean z13;
        TextView textView2;
        boolean z14;
        TextView textView3;
        String strI;
        boolean zMatches;
        g gVar = f55111a;
        if (qf.a.b(g.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (qf.a.b(gVar)) {
                z11 = false;
            } else {
                try {
                    z11 = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th2) {
                    qf.a.a(gVar, th2);
                    z11 = false;
                }
            }
            if (!z11 && !gVar.a((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (qf.a.b(gVar)) {
                    z12 = false;
                    if (!z12) {
                        textView = (TextView) view;
                        if (qf.a.b(gVar)) {
                            z13 = false;
                            if (!z13) {
                                textView2 = (TextView) view;
                                if (qf.a.b(gVar)) {
                                    z14 = false;
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else {
                                            try {
                                                if (textView3.getInputType() == 32) {
                                                    zMatches = true;
                                                } else {
                                                    strI = h.i(textView3);
                                                    if (strI != null || strI.length() == 0) {
                                                        zMatches = false;
                                                    } else {
                                                        zMatches = Patterns.EMAIL_ADDRESS.matcher(strI).matches();
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                qf.a.a(gVar, th3);
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    try {
                                        if (textView2.getInputType() == 3) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                    } catch (Throwable th4) {
                                        qf.a.a(gVar, th4);
                                    }
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            try {
                                if (textView.getInputType() == 112) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } catch (Throwable th5) {
                                qf.a.a(gVar, th5);
                            }
                            if (!z13) {
                                textView2 = (TextView) view;
                                if (qf.a.b(gVar)) {
                                    z14 = false;
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() == 96) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } catch (Throwable th6) {
                        qf.a.a(gVar, th6);
                    }
                    if (!z12) {
                        textView = (TextView) view;
                        if (qf.a.b(gVar)) {
                            z13 = false;
                            if (!z13) {
                                textView2 = (TextView) view;
                                if (qf.a.b(gVar)) {
                                    z14 = false;
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (textView.getInputType() == 112) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                textView2 = (TextView) view;
                                if (qf.a.b(gVar)) {
                                    z14 = false;
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if (textView2.getInputType() == 3) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        textView3 = (TextView) view;
                                        if (qf.a.b(gVar)) {
                                            zMatches = false;
                                        } else if (textView3.getInputType() == 32) {
                                            zMatches = true;
                                        } else {
                                            strI = h.i(textView3);
                                            if (strI != null) {
                                                zMatches = false;
                                            } else {
                                                zMatches = false;
                                            }
                                        }
                                        if (!zMatches) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th7) {
            qf.a.a(g.class, th7);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            String input = h.i(textView);
            Pattern patternCompile = Pattern.compile("\\s");
            m.e(patternCompile, "compile(...)");
            m.f(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
            m.e(strReplaceAll, "replaceAll(...)");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i11 = 0;
                boolean z11 = false;
                for (int i12 = length - 1; -1 < i12; i12--) {
                    char cCharAt = strReplaceAll.charAt(i12);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigit = Character.digit((int) cCharAt, 10);
                    if (iDigit < 0) {
                        throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                    }
                    if (z11 && (iDigit = iDigit * 2) > 9) {
                        iDigit = (iDigit % 10) + 1;
                    }
                    i11 += iDigit;
                    z11 = !z11;
                }
                if (i11 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }
}
