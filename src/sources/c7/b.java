package c7;

import b7.f0;
import b7.w;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6645d;

    public b(String str, byte[] bArr, int i11, int i12) {
        byte b3;
        str.getClass();
        boolean z11 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i12 == 23 && bArr.length == 4) {
                    z11 = true;
                }
                b7.a.d(z11);
                break;
            case "auxiliary.tracks.interleaved":
                if (i12 == 75 && bArr.length == 1 && ((b3 = bArr[0]) == 0 || b3 == 1)) {
                    z11 = true;
                }
                b7.a.d(z11);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i12 == 78 && bArr.length == 8) {
                    z11 = true;
                }
                b7.a.d(z11);
                break;
            case "auxiliary.tracks.map":
                b7.a.d(i12 == 0);
                break;
        }
        this.f6642a = str;
        this.f6643b = bArr;
        this.f6644c = i11;
        this.f6645d = i12;
    }

    public final ArrayList d() {
        b7.a.i("Metadata is not an auxiliary tracks map", this.f6642a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f6643b;
        byte b3 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < b3; i11++) {
            arrayList.add(Integer.valueOf(bArr[i11 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6642a.equals(bVar.f6642a) && Arrays.equals(this.f6643b, bVar.f6643b) && this.f6644c == bVar.f6644c && this.f6645d == bVar.f6645d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6643b) + defpackage.e.d(527, 31, this.f6642a)) * 31) + this.f6644c) * 31) + this.f6645d;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[LOOP:0: B:32:0x00ae->B:34:0x00b1, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb2;
        String str = this.f6642a;
        byte[] bArr = this.f6643b;
        int i11 = this.f6645d;
        if (i11 != 0) {
            if (i11 == 1) {
                string = f0.n(bArr);
            } else if (i11 == 23) {
                Preconditions.c(bArr.length, bArr.length >= 4, 4, "array too small: %s < %s");
                string = String.valueOf(Float.intBitsToFloat(Ints.d(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i11 == 67) {
                Preconditions.c(bArr.length, bArr.length >= 4, 4, "array too small: %s < %s");
                string = String.valueOf(Ints.d(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i11 == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i11 != 78) {
                String str2 = f0.f3975a;
                sb2 = new StringBuilder(bArr.length * 2);
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                }
                string = sb2.toString();
            } else {
                string = String.valueOf(new w(bArr).B());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbN = ep.a.n("track types = ");
            new Joiner(String.valueOf(',')).b(sbN, arrayListD.iterator());
            string = sbN.toString();
        } else {
            String str3 = f0.f3975a;
            sb2 = new StringBuilder(bArr.length * 2);
            while (i12 < bArr.length) {
                sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                sb2.append(Character.forDigit(bArr[i12] & 15, 16));
            }
            string = sb2.toString();
        }
        return defpackage.e.n("mdta: key=", str, ", value=", string);
    }
}
