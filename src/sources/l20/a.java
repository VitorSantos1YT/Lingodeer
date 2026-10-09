package l20;

import ay.k0;
import fr.p3;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f39701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m20.a f39702b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39703c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39704d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq.c f39705e;

    public a(xq.c cVar, CharSequence charSequence) {
        this.f39705e = cVar;
        this.f39701a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m20.b bVar;
        if (this.f39702b == null) {
            CharSequence charSequence = this.f39701a;
            int length = charSequence.length();
            while (true) {
                int i11 = this.f39703c;
                if (i11 >= length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i11);
                xq.c cVar = this.f39705e;
                if (cCharAt == ':') {
                    bVar = (k0) cVar.f56174b;
                } else if (cCharAt == '@') {
                    bVar = (tw.c) cVar.f56176d;
                } else if (cCharAt != 'w') {
                    cVar.getClass();
                    bVar = null;
                } else {
                    bVar = (p3) cVar.f56175c;
                }
                if (bVar != null) {
                    m20.a aVarE = bVar.e(charSequence, this.f39703c, this.f39704d);
                    if (aVarE != null) {
                        this.f39702b = aVarE;
                        int i12 = aVarE.f40830c;
                        this.f39703c = i12;
                        this.f39704d = i12;
                        break;
                    }
                    this.f39703c++;
                } else {
                    this.f39703c++;
                }
            }
        }
        return this.f39702b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        m20.a aVar = this.f39702b;
        this.f39702b = null;
        return aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
