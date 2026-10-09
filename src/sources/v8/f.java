package v8;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import b7.v;
import b7.w;
import com.lingodeer.data.model.AchievementLevelType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f53789h = new w();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f53790i = new v();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53791j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f53792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e[] f53793l;
    public e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f53794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f53795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f53796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53797q;

    public f(int i11, List list) {
        this.f53792k = i11 == -1 ? 1 : i11;
        if (list != null) {
            byte[] bArr = b7.d.f3966a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b3 = ((byte[]) list.get(0))[0];
            }
        }
        this.f53793l = new e[8];
        for (int i12 = 0; i12 < 8; i12++) {
            this.f53793l[i12] = new e();
        }
        this.m = this.f53793l[0];
    }

    @Override // v8.h
    public final tp.g f() {
        List list = this.f53794n;
        this.f53795o = list;
        list.getClass();
        return new tp.g(list, 3);
    }

    @Override // v8.h, e7.c
    public final void flush() {
        super.flush();
        this.f53794n = null;
        this.f53795o = null;
        this.f53797q = 0;
        this.m = this.f53793l[0];
        l();
        this.f53796p = null;
    }

    @Override // v8.h
    public final boolean i() {
        return this.f53794n != this.f53795o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x053d  */
    public final void j() {
        boolean z11;
        char c11;
        v vVar = this.f53796p;
        if (vVar == null) {
            return;
        }
        int i11 = 2;
        boolean z12 = true;
        if (vVar.f4035e != (vVar.f4034d * 2) - 1) {
            b7.a.n("DtvCcPacket ended prematurely; size is " + ((this.f53796p.f4034d * 2) - 1) + ", but current index is " + this.f53796p.f4035e + " (sequence number " + this.f53796p.f4033c + ");");
        }
        v vVar2 = this.f53796p;
        byte[] bArr = vVar2.f4032b;
        int i12 = vVar2.f4035e;
        v vVar3 = this.f53790i;
        vVar3.p(bArr, i12);
        boolean z13 = false;
        while (vVar3.b() > 0) {
            int i13 = 3;
            int i14 = vVar3.i(3);
            int i15 = vVar3.i(5);
            int i16 = 7;
            if (i14 == 7) {
                vVar3.t(i11);
                i14 = vVar3.i(6);
                if (i14 < 7) {
                    defpackage.e.y(i14, "Invalid extended service number: ");
                }
            }
            if (i15 == 0) {
                if (i14 != 0) {
                    b7.a.B("serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                }
                if (z13) {
                    this.f53794n = k();
                }
                this.f53796p = null;
            }
            if (i14 != this.f53792k) {
                vVar3.u(i15);
            } else {
                int iG = (i15 * 8) + vVar3.g();
                while (vVar3.g() < iG) {
                    int i17 = vVar3.i(8);
                    if (i17 != 16) {
                        if (i17 <= 31) {
                            if (i17 != 0) {
                                if (i17 == i13) {
                                    this.f53794n = k();
                                } else if (i17 != 8) {
                                    switch (i17) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i17 >= 17 && i17 <= 23) {
                                                b7.a.B("Currently unsupported COMMAND_EXT1 Command: " + i17);
                                                vVar3.t(8);
                                            } else if (i17 < 24 || i17 > 31) {
                                                defpackage.e.y(i17, "Invalid C0 command: ");
                                            } else {
                                                b7.a.B("Currently unsupported COMMAND_P16 Command: " + i17);
                                                vVar3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.f53770b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i17 <= 127) {
                            if (i17 == 127) {
                                this.m.a((char) 9835);
                            } else {
                                this.m.a((char) (i17 & 255));
                            }
                            z13 = true;
                        } else {
                            if (i17 <= 159) {
                                e[] eVarArr = this.f53793l;
                                switch (i17) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i13 = i13;
                                        z11 = true;
                                        int i18 = i17 - 128;
                                        if (this.f53797q != i18) {
                                            this.f53797q = i18;
                                            this.m = eVarArr[i18];
                                        }
                                        break;
                                    case 136:
                                        i13 = i13;
                                        z11 = true;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (vVar3.h()) {
                                                e eVar = eVarArr[8 - i19];
                                                eVar.f53769a.clear();
                                                eVar.f53770b.clear();
                                                eVar.f53782o = -1;
                                                eVar.f53783p = -1;
                                                eVar.f53784q = -1;
                                                eVar.f53786s = -1;
                                                eVar.f53788u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i13 = i13;
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i21].f53772d = true;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 138:
                                        i13 = i13;
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i22].f53772d = false;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 139:
                                        i13 = i13;
                                        for (int i23 = 1; i23 <= 8; i23++) {
                                            if (vVar3.h()) {
                                                e eVar2 = eVarArr[8 - i23];
                                                eVar2.f53772d = !eVar2.f53772d;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 140:
                                        i13 = i13;
                                        for (int i24 = 1; i24 <= 8; i24++) {
                                            if (vVar3.h()) {
                                                eVarArr[8 - i24].d();
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 141:
                                        i13 = i13;
                                        vVar3.t(8);
                                        z11 = true;
                                        break;
                                    case 142:
                                        i13 = i13;
                                        z11 = true;
                                        break;
                                    case 143:
                                        i13 = i13;
                                        l();
                                        z11 = true;
                                        break;
                                    case 144:
                                        int i25 = i11;
                                        if (this.m.f53771c) {
                                            vVar3.i(4);
                                            vVar3.i(i25);
                                            vVar3.i(i25);
                                            boolean zH = vVar3.h();
                                            boolean zH2 = vVar3.h();
                                            i13 = 3;
                                            vVar3.i(3);
                                            vVar3.i(3);
                                            this.m.e(zH, zH2);
                                        } else {
                                            vVar3.t(16);
                                            i13 = 3;
                                        }
                                        z11 = true;
                                        break;
                                    case 145:
                                        if (this.m.f53771c) {
                                            int iC = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            int iC2 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            vVar3.t(2);
                                            e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            vVar3.t(24);
                                        }
                                        i13 = 3;
                                        z11 = true;
                                        break;
                                    case 146:
                                        if (this.m.f53771c) {
                                            vVar3.t(4);
                                            int i26 = vVar3.i(4);
                                            vVar3.t(2);
                                            vVar3.i(6);
                                            e eVar3 = this.m;
                                            if (eVar3.f53788u != i26) {
                                                eVar3.a('\n');
                                            }
                                            eVar3.f53788u = i26;
                                        } else {
                                            vVar3.t(16);
                                        }
                                        i13 = 3;
                                        z11 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        defpackage.e.y(i17, "Invalid C1 command: ");
                                        i13 = i13;
                                        z11 = true;
                                        break;
                                    case 151:
                                        if (this.m.f53771c) {
                                            int iC3 = e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), vVar3.i(2));
                                            vVar3.i(2);
                                            e.c(vVar3.i(2), vVar3.i(2), vVar3.i(2), 0);
                                            vVar3.h();
                                            vVar3.h();
                                            vVar3.i(2);
                                            vVar3.i(2);
                                            int i27 = vVar3.i(2);
                                            vVar3.t(8);
                                            e eVar4 = this.m;
                                            eVar4.f53781n = iC3;
                                            eVar4.f53779k = i27;
                                        } else {
                                            vVar3.t(32);
                                        }
                                        i13 = 3;
                                        z11 = true;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i28 = i17 - 152;
                                        e eVar5 = eVarArr[i28];
                                        vVar3.t(i11);
                                        boolean zH3 = vVar3.h();
                                        vVar3.t(i11);
                                        int i29 = vVar3.i(i13);
                                        boolean zH4 = vVar3.h();
                                        int i30 = vVar3.i(i16);
                                        int i31 = vVar3.i(8);
                                        int i32 = vVar3.i(4);
                                        int i33 = vVar3.i(4);
                                        vVar3.t(i11);
                                        vVar3.t(6);
                                        vVar3.t(i11);
                                        int i34 = vVar3.i(i13);
                                        int i35 = vVar3.i(i13);
                                        ArrayList arrayList = eVar5.f53769a;
                                        eVar5.f53771c = true;
                                        eVar5.f53772d = zH3;
                                        eVar5.f53773e = i29;
                                        eVar5.f53774f = zH4;
                                        eVar5.f53775g = i30;
                                        eVar5.f53776h = i31;
                                        eVar5.f53777i = i32;
                                        int i36 = i33 + 1;
                                        if (eVar5.f53778j != i36) {
                                            eVar5.f53778j = i36;
                                            while (true) {
                                                if (arrayList.size() >= eVar5.f53778j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i34 != 0 && eVar5.f53780l != i34) {
                                            eVar5.f53780l = i34;
                                            int i37 = i34 - 1;
                                            int i38 = e.B[i37];
                                            boolean z14 = e.A[i37];
                                            int i39 = e.f53767y[i37];
                                            int i40 = e.f53768z[i37];
                                            int i41 = e.f53766x[i37];
                                            eVar5.f53781n = i38;
                                            eVar5.f53779k = i41;
                                        }
                                        if (i35 != 0 && eVar5.m != i35) {
                                            eVar5.m = i35;
                                            int i42 = i35 - 1;
                                            int i43 = e.D[i42];
                                            int i44 = e.C[i42];
                                            eVar5.e(false, false);
                                            eVar5.f(e.f53764v, e.E[i42]);
                                        }
                                        if (this.f53797q != i28) {
                                            this.f53797q = i28;
                                            this.m = eVarArr[i28];
                                        }
                                        i13 = 3;
                                        z11 = true;
                                        break;
                                }
                            } else {
                                i13 = i13;
                                z11 = true;
                                if (i17 <= 255) {
                                    this.m.a((char) (i17 & 255));
                                } else {
                                    defpackage.e.y(i17, "Invalid base command: ");
                                }
                                i11 = 2;
                                i16 = 7;
                            }
                            z13 = z11;
                            i11 = 2;
                            i16 = 7;
                        }
                        z11 = true;
                    } else {
                        i13 = i13;
                        z11 = true;
                        int i45 = vVar3.i(8);
                        if (i45 <= 31) {
                            i16 = 7;
                            if (i45 > 7) {
                                if (i45 <= 15) {
                                    vVar3.t(8);
                                } else if (i45 <= 23) {
                                    vVar3.t(16);
                                } else if (i45 <= 31) {
                                    vVar3.t(24);
                                }
                            }
                        } else {
                            i16 = 7;
                            if (i45 <= 127) {
                                if (i45 == 32) {
                                    this.m.a(' ');
                                } else if (i45 == 33) {
                                    this.m.a((char) 160);
                                } else if (i45 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i45 == 42) {
                                    this.m.a((char) 352);
                                } else if (i45 == 44) {
                                    this.m.a((char) 338);
                                } else if (i45 == 63) {
                                    this.m.a((char) 376);
                                } else if (i45 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i45 == 58) {
                                    this.m.a((char) 353);
                                } else if (i45 == 60) {
                                    this.m.a((char) 339);
                                } else if (i45 != 61) {
                                    switch (i45) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i45) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case AchievementLevelType.DAY_STREAK_LV_7 /* 125 */:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    defpackage.e.y(i45, "Invalid G2 character: ");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z13 = true;
                            } else {
                                if (i45 > 159) {
                                    i11 = 2;
                                    c11 = 6;
                                    if (i45 <= 255) {
                                        if (i45 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            defpackage.e.y(i45, "Invalid G3 character: ");
                                            this.m.a('_');
                                        }
                                        z13 = true;
                                    } else {
                                        defpackage.e.y(i45, "Invalid extended command: ");
                                    }
                                } else if (i45 <= 135) {
                                    vVar3.t(32);
                                } else if (i45 <= 143) {
                                    vVar3.t(40);
                                } else if (i45 <= 159) {
                                    i11 = 2;
                                    vVar3.t(2);
                                    c11 = 6;
                                    vVar3.t(vVar3.i(6) * 8);
                                }
                                boolean z15 = z11;
                                i13 = i13;
                                i11 = i11;
                                z12 = z15;
                                i16 = i16;
                            }
                        }
                        i11 = 2;
                    }
                    c11 = 6;
                    boolean z16 = z11;
                    i13 = i13;
                    i11 = i11;
                    z12 = z16;
                    i16 = i16;
                }
            }
        }
        if (z13) {
            this.f53794n = k();
        }
        this.f53796p = null;
    }

    public final List k() {
        d dVar;
        Layout.Alignment alignment;
        float f5;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            e[] eVarArr = this.f53793l;
            e eVar = eVarArr[i11];
            if (eVar.f53771c && (!eVar.f53769a.isEmpty() || eVar.f53770b.length() != 0)) {
                e eVar2 = eVarArr[i11];
                if (eVar2.f53772d) {
                    ArrayList arrayList2 = eVar2.f53769a;
                    if (!eVar2.f53771c || (arrayList2.isEmpty() && eVar2.f53770b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i12));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i13 = eVar2.f53779k;
                        if (i13 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i13 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f53779k);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (eVar2.f53774f) {
                            f5 = eVar2.f53776h / 99.0f;
                            f11 = eVar2.f53775g / 99.0f;
                        } else {
                            f5 = eVar2.f53776h / 209.0f;
                            f11 = eVar2.f53775g / 74.0f;
                        }
                        float f12 = (f5 * 0.9f) + 0.05f;
                        float f13 = (f11 * 0.9f) + 0.05f;
                        int i14 = eVar2.f53777i;
                        int i15 = i14 / 3;
                        int i16 = i15 == 0 ? 0 : i15 == 1 ? 1 : 2;
                        int i17 = i14 % 3;
                        int i18 = i17 == 0 ? 0 : i17 == 1 ? 1 : 2;
                        int i19 = eVar2.f53781n;
                        dVar = new d(spannableStringBuilder, alignment2, f13, i16, f12, i18, i19 != e.f53765w, i19, eVar2.f53773e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f53761c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            arrayList3.add(((d) arrayList.get(i21)).f53762a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f53793l[i11].d();
        }
    }

    @Override // v8.h
    public final void g(g gVar) {
        ByteBuffer byteBuffer = gVar.f25115e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        w wVar = this.f53789h;
        wVar.G(bArrArray, iLimit);
        while (wVar.a() >= 3) {
            int iW = wVar.w();
            int i11 = iW & 3;
            boolean z11 = (iW & 4) == 4;
            byte bW = (byte) wVar.w();
            byte bW2 = (byte) wVar.w();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        j();
                        int i12 = (bW & 192) >> 6;
                        int i13 = this.f53791j;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            l();
                            b7.a.B("Sequence number discontinuity. previous=" + this.f53791j + " current=" + i12);
                        }
                        this.f53791j = i12;
                        int i14 = bW & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        v vVar = new v(i12, i14);
                        this.f53796p = vVar;
                        byte[] bArr = vVar.f4032b;
                        vVar.f4035e = 1;
                        bArr[0] = bW2;
                    } else {
                        b7.a.d(i11 == 2);
                        v vVar2 = this.f53796p;
                        if (vVar2 == null) {
                            b7.a.o(DytezVyM.wQmD);
                        } else {
                            byte[] bArr2 = vVar2.f4032b;
                            int i15 = vVar2.f4035e;
                            int i16 = i15 + 1;
                            vVar2.f4035e = i16;
                            bArr2[i15] = bW;
                            vVar2.f4035e = i15 + 2;
                            bArr2[i16] = bW2;
                        }
                    }
                    v vVar3 = this.f53796p;
                    if (vVar3.f4035e == (vVar3.f4034d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }
}
