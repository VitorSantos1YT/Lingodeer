package i0;

import a5.f;
import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import g2.v0;
import g2.x;
import j3.h;
import j3.p0;
import java.util.List;
import n3.p;
import n3.s;
import ry.r;
import u3.l;
import u3.o;
import z2.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f33890a = new StackTraceElement[0];

    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    public static final b1 a(h hVar) {
        List list = hVar.f35701c;
        r rVar = r.f50854a;
        List list2 = list == null ? rVar : list;
        CharSequence charSequence = hVar.f35700b;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            f fVar = new f(14, false);
            fVar.f378b = Parcel.obtain();
            if (list == null) {
                list = rVar;
            }
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                j3.f fVar2 = (j3.f) list.get(i11);
                p0 p0Var = (p0) fVar2.f35689a;
                int i12 = fVar2.f35690b;
                int i13 = fVar2.f35691c;
                ((Parcel) fVar.f378b).recycle();
                fVar.f378b = Parcel.obtain();
                o oVar = p0Var.f35754a;
                long j11 = p0Var.f35765l;
                long j12 = p0Var.f35761h;
                int i14 = i11;
                long j13 = p0Var.f35755b;
                List list3 = list;
                int i15 = size;
                long jB = oVar.b();
                long j14 = x.f28622i;
                if (!x.d(jB, j14)) {
                    fVar.h((byte) 1);
                    ((Parcel) fVar.f378b).writeLong(p0Var.f35754a.b());
                }
                long j15 = v3.o.f53501c;
                byte b3 = 2;
                if (!v3.o.a(j13, j15)) {
                    fVar.h((byte) 2);
                    fVar.j(j13);
                }
                s sVar = p0Var.f35756c;
                if (sVar != null) {
                    fVar.h((byte) 3);
                    ((Parcel) fVar.f378b).writeInt(sVar.f43179a);
                }
                n3.o oVar2 = p0Var.f35757d;
                if (oVar2 != null) {
                    int i16 = oVar2.f43170a;
                    fVar.h((byte) 4);
                    fVar.h((i16 != 0 && i16 == 1) ? (byte) 1 : (byte) 0);
                }
                p pVar = p0Var.f35758e;
                if (pVar != null) {
                    int i17 = pVar.f43171a;
                    fVar.h((byte) 5);
                    if (i17 == 0) {
                        b3 = 0;
                    } else if (i17 == 65535) {
                        b3 = 1;
                    } else if (i17 != 1) {
                        if (i17 == 2) {
                            b3 = 3;
                        } else {
                            b3 = 0;
                        }
                    }
                    fVar.h(b3);
                }
                String str = p0Var.f35760g;
                if (str != null) {
                    fVar.h((byte) 6);
                    ((Parcel) fVar.f378b).writeString(str);
                }
                if (!v3.o.a(j12, j15)) {
                    fVar.h((byte) 7);
                    fVar.j(j12);
                }
                u3.a aVar = p0Var.f35762i;
                if (aVar != null) {
                    float f5 = aVar.f52733a;
                    fVar.h((byte) 8);
                    fVar.i(f5);
                }
                u3.p pVar2 = p0Var.f35763j;
                if (pVar2 != null) {
                    fVar.h((byte) 9);
                    fVar.i(pVar2.f52758a);
                    fVar.i(pVar2.f52759b);
                }
                if (!x.d(j11, j14)) {
                    fVar.h((byte) 10);
                    ((Parcel) fVar.f378b).writeLong(j11);
                }
                l lVar = p0Var.m;
                if (lVar != null) {
                    fVar.h((byte) 11);
                    ((Parcel) fVar.f378b).writeInt(lVar.f52754a);
                }
                v0 v0Var = p0Var.f35766n;
                if (v0Var != null) {
                    fVar.h((byte) 12);
                    ((Parcel) fVar.f378b).writeLong(v0Var.f28611a);
                    long j16 = v0Var.f28612b;
                    fVar.i(Float.intBitsToFloat((int) (j16 >> 32)));
                    fVar.i(Float.intBitsToFloat((int) (j16 & 4294967295L)));
                    fVar.i(v0Var.f28613c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) fVar.f378b).marshall(), 0)), i12, i13, 33);
                i11 = i14 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i15;
            }
            charSequence = spannableString;
        }
        return new b1(ClipData.newPlainText("plain text", charSequence));
    }
}
