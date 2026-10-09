package e00;

import android.view.View;
import android.view.ViewGroup;
import g00.z;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qy.s;
import qy.u;
import qy.w;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24695c;

    public /* synthetic */ i(Object obj, int i11) {
        this.f24693a = i11;
        this.f24695c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24693a) {
            case 0:
                return this.f24694b > 0;
            case 1:
                return this.f24694b < ((Object[]) this.f24695c).length;
            case 2:
                return this.f24694b < ((byte[]) this.f24695c).length;
            case 3:
                return this.f24694b < ((int[]) this.f24695c).length;
            case 4:
                return this.f24694b < ((long[]) this.f24695c).length;
            case 5:
                return this.f24694b < ((short[]) this.f24695c).length;
            case 6:
                return this.f24694b < ((ry.e) this.f24695c).b();
            case 7:
                return this.f24694b < ((u0) this.f24695c).h();
            default:
                return this.f24694b < ((ViewGroup) this.f24695c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24693a) {
            case 0:
                z zVar = (z) this.f24695c;
                int i11 = zVar.f28391c;
                int i12 = this.f24694b;
                this.f24694b = i12 - 1;
                return zVar.f28393e[i11 - i12];
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f24695c;
                    int i13 = this.f24694b;
                    this.f24694b = i13 + 1;
                    return objArr[i13];
                } catch (ArrayIndexOutOfBoundsException e8) {
                    this.f24694b--;
                    throw new NoSuchElementException(e8.getMessage());
                }
            case 2:
                int i14 = this.f24694b;
                byte[] bArr = (byte[]) this.f24695c;
                if (i14 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f24694b));
                }
                this.f24694b = i14 + 1;
                return new s(bArr[i14]);
            case 3:
                int i15 = this.f24694b;
                int[] iArr = (int[]) this.f24695c;
                if (i15 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f24694b));
                }
                this.f24694b = i15 + 1;
                return new u(iArr[i15]);
            case 4:
                int i16 = this.f24694b;
                long[] jArr = (long[]) this.f24695c;
                if (i16 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f24694b));
                }
                this.f24694b = i16 + 1;
                return new w(jArr[i16]);
            case 5:
                int i17 = this.f24694b;
                short[] sArr = (short[]) this.f24695c;
                if (i17 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f24694b));
                }
                this.f24694b = i17 + 1;
                return new qy.z(sArr[i17]);
            case 6:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ry.e eVar = (ry.e) this.f24695c;
                int i18 = this.f24694b;
                this.f24694b = i18 + 1;
                return eVar.get(i18);
            case 7:
                u0 u0Var = (u0) this.f24695c;
                int i19 = this.f24694b;
                this.f24694b = i19 + 1;
                return u0Var.i(i19);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f24695c;
                int i21 = this.f24694b;
                this.f24694b = i21 + 1;
                View childAt = viewGroup.getChildAt(i21);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24693a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f24695c;
                int i11 = this.f24694b - 1;
                this.f24694b = i11;
                viewGroup.removeViewAt(i11);
                return;
        }
    }

    public i(Object[] array) {
        this.f24693a = 1;
        kotlin.jvm.internal.m.f(array, "array");
        this.f24695c = array;
    }

    public i(z zVar) {
        this.f24693a = 0;
        this.f24695c = zVar;
        this.f24694b = zVar.f28391c;
    }
}
