package com.android.billingclient.api;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements zzr, he.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7471c;

    public /* synthetic */ c0(char c11, int i11) {
        this.f7469a = i11;
    }

    public int a(b.a aVar) {
        int i11 = this.f7470b;
        int iP = 1;
        for (int i12 = i11; i12 != 0; i12--) {
            iP = aVar.p((short[]) this.f7471c, iP) + (iP << 1);
        }
        return iP - (1 << i11);
    }

    public void b() {
        WeakReference weakReference;
        this.f7470b = 0;
        Iterator it = ((LinkedHashMap) this.f7471c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                ec.f fVar = (ec.f) ry.m.s0(arrayList);
                if (((fVar == null || (weakReference = fVar.f25466b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int i13 = i12 - i11;
                    if (((ec.f) arrayList.get(i13)).f25466b.get() == null) {
                        arrayList.remove(i13);
                        i11++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void c(int i11, int i12) {
        int i13 = i12 + i11;
        char[] cArr = (char[]) this.f7471c;
        if (cArr.length <= i13) {
            int i14 = i11 * 2;
            if (i13 < i14) {
                i13 = i14;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i13);
            kotlin.jvm.internal.m.e(cArrCopyOf, "copyOf(...)");
            this.f7471c = cArrCopyOf;
        }
    }

    public boolean d() {
        return ((kd.b) this.f7471c) != null;
    }

    public long e(x7.j jVar) {
        b7.w wVar = (b7.w) this.f7471c;
        int i11 = 0;
        jVar.f(wVar.f4039a, 0, 1, false);
        int i12 = wVar.f4039a[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while ((i12 & i13) == 0) {
            i13 >>= 1;
            i14++;
        }
        int i15 = i12 & (~i13);
        jVar.f(wVar.f4039a, 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (wVar.f4039a[i11] & 255) + (i15 << 8);
        }
        this.f7470b = i14 + 1 + this.f7470b;
        return i15;
    }

    public void f() {
        i00.d dVar = i00.d.f33900c;
        char[] array = (char[]) this.f7471c;
        dVar.getClass();
        kotlin.jvm.internal.m.f(array, "array");
        synchronized (dVar) {
            int i11 = dVar.f1509a;
            if (array.length + i11 < i00.c.f33899a) {
                dVar.f1509a = i11 + array.length;
                ((ry.k) dVar.f1510b).addLast(array);
            }
        }
    }

    public synchronized void g(ec.a aVar, Bitmap bitmap, Map map, int i11) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7471c;
            Object arrayList = linkedHashMap.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(aVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            ec.f fVar = new ec.f(iIdentityHashCode, new WeakReference(bitmap), map, i11);
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    arrayList2.add(fVar);
                    break;
                }
                ec.f fVar2 = (ec.f) arrayList2.get(i12);
                if (i11 >= fVar2.f25468d) {
                    if (fVar2.f25465a != iIdentityHashCode || fVar2.f25466b.get() != bitmap) {
                        arrayList2.add(i12, fVar);
                        break;
                    } else {
                        arrayList2.set(i12, fVar);
                        break;
                    }
                }
                i12++;
            }
            int i13 = this.f7470b;
            this.f7470b = i13 + 1;
            if (i13 >= 10) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    public int h(int i11) {
        float f5 = -1;
        SparseArray sparseArray = (SparseArray) this.f7471c;
        int i12 = 0;
        if (-1 == i11) {
            j4.w wVar = i11 == -1 ? (j4.w) sparseArray.valueAt(0) : (j4.w) sparseArray.get(-1);
            if (wVar != null) {
                ArrayList arrayList = wVar.f36053b;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                        break;
                    }
                    if (((j4.x) arrayList.get(i12)).a(f5, f5)) {
                        break;
                    }
                    i12++;
                }
                if (-1 != i12) {
                    return i12 == -1 ? wVar.f36054c : ((j4.x) arrayList.get(i12)).f36059e;
                }
            }
        } else {
            j4.w wVar2 = (j4.w) sparseArray.get(i11);
            if (wVar2 != null) {
                ArrayList arrayList2 = wVar2.f36053b;
                while (i12 < arrayList2.size()) {
                    if (((j4.x) arrayList2.get(i12)).a(f5, f5)) {
                        return i12 == -1 ? wVar2.f36054c : ((j4.x) arrayList2.get(i12)).f36059e;
                    }
                    i12++;
                }
                i12 = -1;
                if (i12 == -1) {
                }
            }
        }
        return -1;
    }

    public void i(z00.t tVar) {
        z00.t tVar2 = tVar.f58444b;
        while (tVar2 != null) {
            z00.t tVar3 = tVar2.f58447e;
            tVar2.a(this);
            tVar2 = tVar3;
        }
    }

    public void j(String text) {
        kotlin.jvm.internal.m.f(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        c(this.f7470b, length);
        text.getChars(0, text.length(), (char[]) this.f7471c, this.f7470b);
        this.f7470b += length;
    }

    @Override // he.b
    public vd.b0 k(vd.b0 b0Var, td.j jVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b0Var.get()).compress((Bitmap.CompressFormat) this.f7471c, this.f7470b, byteArrayOutputStream);
        b0Var.b();
        return new ce.d0(byteArrayOutputStream.toByteArray());
    }

    public String l(zzp zzpVar) {
        String str;
        g0 g0Var = (g0) this.f7471c;
        int i11 = this.f7470b;
        try {
            if (g0Var.F == null) {
                throw null;
            }
            zzau zzauVar = g0Var.F;
            String packageName = g0Var.D.getPackageName();
            if (i11 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i11 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i11 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i11 != 5) {
                str = i11 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzauVar.h0(packageName, str, new e0(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception unused) {
            g0Var.H(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, j0.f7538r);
            int i12 = zzc.f12272a;
            zzpVar.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.f7469a) {
            case 5:
                return new String((char[]) this.f7471c, 0, this.f7470b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c0(Object obj, int i11, int i12) {
        this.f7469a = i12;
        this.f7471c = obj;
        this.f7470b = i11;
    }

    public c0(int i11) {
        this.f7469a = 1;
        this.f7470b = i11;
        this.f7471c = new short[1 << i11];
    }

    public c0(r00.a aVar) {
        this.f7469a = 12;
        this.f7471c = aVar;
        this.f7470b = 0;
    }

    public c0(int i11, byte b3) {
        this.f7469a = i11;
        switch (i11) {
            case 4:
                this.f7471c = Bitmap.CompressFormat.JPEG;
                this.f7470b = 100;
                break;
            case 7:
                this.f7470b = 255;
                this.f7471c = null;
                break;
            case 10:
                this.f7471c = new b7.w(8);
                break;
            case 14:
                this.f7470b = 0;
                this.f7471c = new StringBuilder();
                break;
            default:
                this.f7471c = new LinkedHashMap();
                break;
        }
    }

    public c0(Context context, XmlResourceParser xmlResourceParser) {
        this.f7469a = 6;
        this.f7470b = -1;
        this.f7471c = new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), j4.t.C);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 0) {
                this.f7470b = typedArrayObtainStyledAttributes.getResourceId(index, this.f7470b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            j4.w wVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                wVar = new j4.w(context, xmlResourceParser);
                                ((SparseArray) this.f7471c).put(wVar.f36052a, wVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                j4.x xVar = new j4.x(context, xmlResourceParser);
                                if (wVar != null) {
                                    wVar.f36053b.add(xVar);
                                }
                            }
                            break;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public c0(boolean z11, boolean z12, boolean z13) {
        this.f7469a = 9;
        this.f7470b = (z11 || z12 || z13) ? 1 : 0;
    }
}
