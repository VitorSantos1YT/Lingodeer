package b10;

import a10.e;
import a5.f;
import aj.uZCn.evRpcb;
import com.tbruyelle.rxpermissions3.BuildConfig;
import i1.a0;
import j3.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlin.jvm.internal.m;
import lz.g;
import m00.i;
import m00.l;
import nv.p;
import o3.d0;
import o3.f0;
import oz.q;
import w4.c;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3850e;

    public b(List list) {
        this.f3850e = new e(BuildConfig.VERSION_NAME, null);
        this.f3848c = 0;
        this.f3849d = list;
        this.f3846a = 0;
        this.f3847b = 0;
        if (list.isEmpty()) {
            return;
        }
        b(0, 0);
        e eVar = (e) list.get(0);
        this.f3850e = eVar;
        this.f3848c = eVar.f289a.length();
    }

    @Override // o3.f0
    public d0 a(h hVar) {
        String strSubstring = hVar.f35700b;
        int length = strSubstring.length();
        int i11 = this.f3848c;
        int i12 = 0;
        if (length > i11) {
            g range = hz.b.U(0, i11);
            m.f(strSubstring, "<this>");
            m.f(range, "range");
            strSubstring = strSubstring.substring(range.f40532a, range.f40533b + 1);
            m.e(strSubstring, "substring(...)");
        }
        String string = BuildConfig.VERSION_NAME;
        int i13 = 0;
        while (i12 < strSubstring.length()) {
            int i14 = i13 + 1;
            string = string + strSubstring.charAt(i12);
            if (i14 == this.f3846a || i13 + 2 == this.f3847b) {
                StringBuilder sbN = ep.a.n(string);
                sbN.append(((a0) this.f3849d).f33968b);
                string = sbN.toString();
            }
            i12++;
            i13 = i14;
        }
        return new d0(new h(6, string, null), (f) this.f3850e);
    }

    public int c(char c11) {
        int i11 = 0;
        while (true) {
            char cN = n();
            if (cN == 0) {
                return -1;
            }
            if (cN == c11) {
                return i11;
            }
            i11++;
            k();
        }
    }

    public void d() {
        int i11 = this.f3848c;
        this.f3848c = i11 == Integer.MIN_VALUE ? this.f3846a : i11 + this.f3847b;
        this.f3850e = ((String) this.f3849d) + this.f3848c;
    }

    public a10.f e(a9.e eVar, a9.e eVar2) {
        List list = (List) this.f3849d;
        int i11 = eVar.f478b;
        int i12 = eVar.f479c;
        int i13 = eVar2.f478b;
        int i14 = eVar2.f479c;
        if (i11 == i13) {
            e eVar3 = (e) list.get(i11);
            CharSequence charSequenceSubSequence = eVar3.f289a.subSequence(i12, i14);
            y yVar = eVar3.f290b;
            e eVar4 = new e(charSequenceSubSequence, yVar != null ? yVar.a(i12, i14) : null);
            a10.f fVar = new a10.f(0);
            fVar.f291a.add(eVar4);
            return fVar;
        }
        a10.f fVar2 = new a10.f(0);
        e eVar5 = (e) list.get(i11);
        e eVarA = eVar5.a(i12, eVar5.f289a.length());
        ArrayList arrayList = fVar2.f291a;
        arrayList.add(eVarA);
        while (true) {
            i11++;
            if (i11 >= i13) {
                arrayList.add(((e) list.get(i13)).a(0, i14));
                return fVar2;
            }
            arrayList.add((e) list.get(i11));
        }
    }

    public boolean f() {
        return this.f3847b < this.f3848c || this.f3846a < ((List) this.f3849d).size() - 1;
    }

    public void g(ow.b bVar) {
        int i11;
        int i12 = bVar.f46098c;
        if (i12 > 4096) {
            Arrays.fill((ow.b[]) this.f3850e, (Object) null);
            this.f3847b = ((ow.b[]) this.f3850e).length - 1;
            this.f3846a = 0;
            this.f3848c = 0;
            return;
        }
        int i13 = (this.f3848c + i12) - 4096;
        if (i13 > 0) {
            int length = ((ow.b[]) this.f3850e).length - 1;
            int i14 = 0;
            while (true) {
                i11 = this.f3847b;
                if (length < i11 || i13 <= 0) {
                    break;
                }
                int i15 = ((ow.b[]) this.f3850e)[length].f46098c;
                i13 -= i15;
                this.f3848c -= i15;
                this.f3846a--;
                i14++;
                length--;
            }
            ow.b[] bVarArr = (ow.b[]) this.f3850e;
            int i16 = i11 + 1;
            System.arraycopy(bVarArr, i16, bVarArr, i16 + i14, this.f3846a);
            this.f3847b += i14;
        }
        int i17 = this.f3846a + 1;
        ow.b[] bVarArr2 = (ow.b[]) this.f3850e;
        if (i17 > bVarArr2.length) {
            ow.b[] bVarArr3 = new ow.b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f3847b = ((ow.b[]) this.f3850e).length - 1;
            this.f3850e = bVarArr3;
        }
        int i18 = this.f3847b;
        this.f3847b = i18 - 1;
        ((ow.b[]) this.f3850e)[i18] = bVar;
        this.f3846a++;
        this.f3848c += i12;
    }

    public int h(f fVar) {
        int i11 = 0;
        while (((BitSet) fVar.f378b).get(n())) {
            i11++;
            k();
        }
        return i11;
    }

    public int i(char c11) {
        int i11 = 0;
        while (n() == c11) {
            i11++;
            k();
        }
        return i11;
    }

    public void j() {
        if (this.f3848c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void k() {
        List list = (List) this.f3849d;
        int i11 = this.f3847b + 1;
        this.f3847b = i11;
        if (i11 > this.f3848c) {
            int i12 = this.f3846a + 1;
            this.f3846a = i12;
            if (i12 < list.size()) {
                e eVar = (e) list.get(this.f3846a);
                this.f3850e = eVar;
                this.f3848c = eVar.f289a.length();
            } else {
                e eVar2 = new e(BuildConfig.VERSION_NAME, null);
                this.f3850e = eVar2;
                this.f3848c = eVar2.f289a.length();
            }
            this.f3847b = 0;
        }
    }

    public boolean l(char c11) {
        if (n() != c11) {
            return false;
        }
        k();
        return true;
    }

    public boolean m(String str) {
        int i11 = this.f3847b;
        if (i11 < this.f3848c && str.length() + i11 <= this.f3848c) {
            for (int i12 = 0; i12 < str.length(); i12++) {
                if (((e) this.f3850e).f289a.charAt(this.f3847b + i12) == str.charAt(i12)) {
                }
            }
            this.f3847b = str.length() + this.f3847b;
            return true;
        }
        return false;
    }

    public char n() {
        int i11 = this.f3847b;
        if (i11 < this.f3848c) {
            return ((e) this.f3850e).f289a.charAt(i11);
        }
        return this.f3846a < ((List) this.f3849d).size() + (-1) ? '\n' : (char) 0;
    }

    public a9.e o() {
        return new a9.e(this.f3846a, this.f3847b, 1);
    }

    public void p(a9.e eVar) {
        int i11 = eVar.f478b;
        int i12 = eVar.f479c;
        b(i11, i12);
        this.f3846a = i11;
        this.f3847b = i12;
        e eVar2 = (e) ((List) this.f3849d).get(i11);
        this.f3850e = eVar2;
        this.f3848c = eVar2.f289a.length();
    }

    public int q() {
        int i11 = 0;
        while (true) {
            char cN = n();
            if (cN != ' ') {
                switch (cN) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i11;
                }
            }
            i11++;
            k();
        }
    }

    public void r(l lVar) {
        s(lVar.e(), 127, 0);
        ((i) this.f3849d).I(lVar);
    }

    public void s(int i11, int i12, int i13) {
        i iVar = (i) this.f3849d;
        if (i11 < i12) {
            iVar.J(i11 | i13);
            return;
        }
        iVar.J(i13 | i12);
        int i14 = i11 - i12;
        while (i14 >= 128) {
            iVar.J(128 | (i14 & 127));
            i14 >>>= 7;
        }
        iVar.J(i14);
    }

    public void b(int i11, int i12) {
        List list = (List) this.f3849d;
        if (i11 < 0 || i11 >= list.size()) {
            throw new IllegalArgumentException(p.p("Line index ", i11, list.size(), evRpcb.nrWiN));
        }
        e eVar = (e) list.get(i11);
        if (i12 < 0 || i12 > eVar.f289a.length()) {
            throw new IllegalArgumentException(p.p("Index ", i12, eVar.f289a.length(), " out of range, line length: "));
        }
    }

    public b(int i11, int i12) {
        this(Integer.MIN_VALUE, i11, i12);
    }

    public b(int i11, int i12, int i13) {
        String strF;
        if (i11 == Integer.MIN_VALUE) {
            strF = BuildConfig.VERSION_NAME;
        } else {
            strF = c.f(i11, "/");
        }
        this.f3849d = strF;
        this.f3846a = i12;
        this.f3847b = i13;
        this.f3848c = Integer.MIN_VALUE;
        this.f3850e = BuildConfig.VERSION_NAME;
    }

    public b(a0 a0Var) {
        this.f3849d = a0Var;
        String str = a0Var.f33967a;
        char c11 = a0Var.f33968b;
        this.f3846a = q.H0(str, c11, 0, 6);
        this.f3847b = q.N0(str, c11, 0, 6);
        this.f3848c = a0Var.f33969c.length();
        this.f3850e = new f(this, 12);
    }

    public b(i iVar) {
        this.f3850e = new ow.b[8];
        this.f3847b = 7;
        this.f3849d = iVar;
    }
}
