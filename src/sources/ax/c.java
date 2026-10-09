package ax;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b7.e0;
import com.android.billingclient.api.h0;
import com.android.billingclient.api.j;
import com.android.billingclient.api.j0;
import com.android.billingclient.api.y;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Callable, yw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3259b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f3258a = i11;
        this.f3259b = obj;
    }

    @Override // yw.c
    public Object apply(Object obj) {
        return this.f3259b;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01df  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f5 A[Catch: Exception -> 0x0118, TryCatch #3 {Exception -> 0x0118, blocks: (B:65:0x0111, B:70:0x0123, B:76:0x0144, B:78:0x0148, B:82:0x0157, B:86:0x0168, B:87:0x0181, B:84:0x015f, B:88:0x0184, B:92:0x018f, B:96:0x0198, B:100:0x01a1, B:104:0x01aa, B:108:0x01b3, B:112:0x01bc, B:116:0x01c5, B:120:0x01ce, B:124:0x01d7, B:128:0x01e0, B:132:0x01e9, B:136:0x01f1, B:138:0x01f5, B:139:0x01f9, B:71:0x013a, B:68:0x011b), top: B:190:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x020e A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:142:0x0208, B:144:0x020e, B:146:0x0228, B:147:0x0236, B:148:0x0252, B:150:0x0276, B:151:0x0284), top: B:187:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0228 A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:142:0x0208, B:144:0x020e, B:146:0x0228, B:147:0x0236, B:148:0x0252, B:150:0x0276, B:151:0x0284), top: B:187:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0252 A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:142:0x0208, B:144:0x020e, B:146:0x0228, B:147:0x0236, B:148:0x0252, B:150:0x0276, B:151:0x0284), top: B:187:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0276 A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:142:0x0208, B:144:0x020e, B:146:0x0228, B:147:0x0236, B:148:0x0252, B:150:0x0276, B:151:0x0284), top: B:187:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0208 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleE;
        zzam zzamVar;
        zzie zzieVar;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        Long lA;
        zzjm zzjmVarR;
        zzjt zzjtVarT;
        switch (this.f3258a) {
            case 0:
                return this.f3259b;
            case 1:
                y yVar = (y) this.f3259b;
                com.android.billingclient.api.d dVar = yVar.f7593d;
                synchronized (dVar.f7472a) {
                    try {
                        if (dVar.f7473b != 3) {
                            boolean z23 = dVar.f7473b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundleE = null;
                            } else {
                                bundleE = e0.e("accountName", null);
                                zzc.b(dVar.B.longValue(), bundleE, dVar.f7474c, dVar.f7475d);
                            }
                            zzie zzieVar2 = zzie.REASON_UNSPECIFIED;
                            synchronized (dVar.f7472a) {
                                zzamVar = dVar.f7480i;
                                break;
                            }
                            if (zzamVar == null) {
                                com.android.billingclient.api.d dVar2 = yVar.f7593d;
                                dVar2.m(0);
                                zzie zzieVar3 = zzie.SERVICE_RESET_TO_NULL;
                                j jVar = j0.f7531j;
                                dVar2.l(jVar, zzieVar3);
                                yVar.c(jVar);
                            } else {
                                com.android.billingclient.api.d dVar3 = yVar.f7593d;
                                String packageName = dVar3.f7478g.getPackageName();
                                int iF1 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundleE == null) {
                                            try {
                                                iF1 = zzamVar.f1(i12, packageName, "subs");
                                            } catch (Exception e8) {
                                                int i13 = zzc.f12272a;
                                                boolean z24 = e8 instanceof DeadObjectException;
                                                if (z24) {
                                                    zzieVar = zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                                } else if (e8 instanceof RemoteException) {
                                                    zzieVar = zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                                } else {
                                                    zzieVar = e8 instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                                }
                                                String strA = zzieVar.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? h0.a(e8) : null;
                                                yVar.f7593d.m(0);
                                                yVar.b(z24 ? j0.f7531j : j0.f7529h, zzieVar, strA, z23);
                                                yVar.c(z24 ? j0.f7531j : j0.f7529h);
                                            }
                                        } else {
                                            iF1 = zzamVar.T(i12, bundleE, packageName, "subs");
                                        }
                                        if (iF1 == 0) {
                                            zzc.h("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        } else {
                                            i12--;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                dVar3.f7482k = i12 >= 3;
                                if (i12 < 3) {
                                    zzieVar2 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.h("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i14 = 25; i14 >= 3; i14--) {
                                    iF1 = bundleE == null ? zzamVar.f1(i14, packageName, "inapp") : zzamVar.T(i14, bundleE, packageName, "inapp");
                                    if (iF1 == 0) {
                                        dVar3.f7483l = i14;
                                        zzc.h("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        i11 = dVar3.f7483l;
                                        dVar3.f7483l = i11;
                                        if (i11 >= 26) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        dVar3.f7494x = z11;
                                        if (i11 >= 24) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        dVar3.f7493w = z12;
                                        if (i11 >= 21) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        dVar3.f7492v = z13;
                                        if (i11 >= 20) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        dVar3.f7491u = z14;
                                        if (i11 >= 19) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        dVar3.f7490t = z15;
                                        if (i11 >= 17) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        dVar3.f7489s = z16;
                                        if (i11 >= 16) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        dVar3.f7488r = z17;
                                        if (i11 >= 15) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        dVar3.f7487q = z18;
                                        if (i11 >= 14) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        dVar3.f7486p = z19;
                                        if (i11 >= 12) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        dVar3.f7485o = z20;
                                        if (i11 >= 9) {
                                            z21 = true;
                                        } else {
                                            z21 = false;
                                        }
                                        dVar3.f7484n = z21;
                                        if (i11 >= 6) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        dVar3.m = z22;
                                        if (i11 < 3) {
                                            zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            int i15 = zzc.f12272a;
                                        }
                                        com.android.billingclient.api.d.s(dVar3, iF1);
                                        if (iF1 != 0) {
                                            j jVar2 = j0.f7523b;
                                            yVar.b(jVar2, zzieVar2, null, z23);
                                            yVar.c(jVar2);
                                        } else {
                                            try {
                                                lA = yVar.a(z23);
                                                if (z23) {
                                                    zzhz zzhzVarU = zzib.u();
                                                    zzhzVarU.h();
                                                    zzib.t((zzib) zzhzVarU.f12378b, 6);
                                                    zzjtVarT = zzjv.t();
                                                    zzjtVarT.i(false);
                                                    zzjtVarT.j();
                                                    if (lA != null) {
                                                        long jLongValue = lA.longValue();
                                                        zzjtVarT.h();
                                                        zzjv.r((zzjv) zzjtVarT.f12378b, jLongValue);
                                                    }
                                                    com.android.billingclient.api.d dVar4 = yVar.f7593d;
                                                    zzhzVarU.h();
                                                    zzib.s((zzib) zzhzVarU.f12378b, (zzjv) zzjtVarT.f());
                                                    dVar4.k((zzib) zzhzVarU.f());
                                                } else {
                                                    zzjmVarR = zzjo.r();
                                                    zzic zzicVarU = zzig.u();
                                                    zzicVarU.h();
                                                    zzig.t((zzig) zzicVarU.f12378b, 0);
                                                    zzjmVarR.h();
                                                    zzjo.p((zzjo) zzjmVarR.f12378b, (zzig) zzicVarU.f());
                                                    if (lA != null) {
                                                        long jLongValue2 = lA.longValue();
                                                        zzjmVarR.h();
                                                        zzjo.q((zzjo) zzjmVarR.f12378b, jLongValue2);
                                                    }
                                                    yVar.f7593d.f7479h.A((zzjo) zzjmVarR.f());
                                                }
                                            } catch (Throwable unused) {
                                                int i16 = zzc.f12272a;
                                            }
                                            yVar.c(j0.f7530i);
                                        }
                                    }
                                }
                                i11 = dVar3.f7483l;
                                dVar3.f7483l = i11;
                                if (i11 >= 26) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                dVar3.f7494x = z11;
                                if (i11 >= 24) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                dVar3.f7493w = z12;
                                if (i11 >= 21) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                dVar3.f7492v = z13;
                                if (i11 >= 20) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                dVar3.f7491u = z14;
                                if (i11 >= 19) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                dVar3.f7490t = z15;
                                if (i11 >= 17) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                dVar3.f7489s = z16;
                                if (i11 >= 16) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                dVar3.f7488r = z17;
                                if (i11 >= 15) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                dVar3.f7487q = z18;
                                if (i11 >= 14) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                dVar3.f7486p = z19;
                                if (i11 >= 12) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                dVar3.f7485o = z20;
                                if (i11 >= 9) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                dVar3.f7484n = z21;
                                if (i11 >= 6) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                dVar3.m = z22;
                                if (i11 < 3) {
                                    zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    int i17 = zzc.f12272a;
                                }
                                com.android.billingclient.api.d.s(dVar3, iF1);
                                if (iF1 != 0) {
                                    j jVar3 = j0.f7523b;
                                    yVar.b(jVar3, zzieVar2, null, z23);
                                    yVar.c(jVar3);
                                } else {
                                    lA = yVar.a(z23);
                                    if (z23) {
                                        zzhz zzhzVarU2 = zzib.u();
                                        zzhzVarU2.h();
                                        zzib.t((zzib) zzhzVarU2.f12378b, 6);
                                        zzjtVarT = zzjv.t();
                                        zzjtVarT.i(false);
                                        zzjtVarT.j();
                                        if (lA != null) {
                                            long jLongValue3 = lA.longValue();
                                            zzjtVarT.h();
                                            zzjv.r((zzjv) zzjtVarT.f12378b, jLongValue3);
                                        }
                                        com.android.billingclient.api.d dVar5 = yVar.f7593d;
                                        zzhzVarU2.h();
                                        zzib.s((zzib) zzhzVarU2.f12378b, (zzjv) zzjtVarT.f());
                                        dVar5.k((zzib) zzhzVarU2.f());
                                    } else {
                                        zzjmVarR = zzjo.r();
                                        zzic zzicVarU2 = zzig.u();
                                        zzicVarU2.h();
                                        zzig.t((zzig) zzicVarU2.f12378b, 0);
                                        zzjmVarR.h();
                                        zzjo.p((zzjo) zzjmVarR.f12378b, (zzig) zzicVarU2.f());
                                        if (lA != null) {
                                            long jLongValue4 = lA.longValue();
                                            zzjmVarR.h();
                                            zzjo.q((zzjo) zzjmVarR.f12378b, jLongValue4);
                                        }
                                        yVar.f7593d.f7479h.A((zzjo) zzjmVarR.f());
                                    }
                                    yVar.c(j0.f7530i);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 2:
                synchronized (((rd.c) this.f3259b)) {
                    try {
                        rd.c cVar = (rd.c) this.f3259b;
                        if (cVar.K != null) {
                            cVar.A();
                            if (((rd.c) this.f3259b).h()) {
                                ((rd.c) this.f3259b).x();
                                ((rd.c) this.f3259b).M = 0;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return null;
            case 3:
                View view = (View) ((WeakReference) this.f3259b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return BuildConfig.VERSION_NAME;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                m.e(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
                view.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                m.e(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            default:
                w6.a aVar = (w6.a) this.f3259b;
                aVar.f54655d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.a();
                    Binder.flushPendingCommands();
                    aVar.b(null);
                    return null;
                } catch (Throwable th4) {
                    try {
                        aVar.f54654c.set(true);
                        throw th4;
                    } catch (Throwable th5) {
                        aVar.b(null);
                        throw th5;
                    }
                }
        }
    }

    public c(View view) {
        this.f3258a = 3;
        this.f3259b = new WeakReference(view);
    }
}
