package cz;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends ry.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f22615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f22616d;

    public g(i iVar) {
        this.f22616d = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22615c = arrayDeque;
        File file = (File) iVar.f22619b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new d(file));
        } else {
            this.f50830a = 2;
        }
    }

    @Override // ry.b
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f22615c;
            h hVar = (h) arrayDeque.peek();
            if (hVar == null) {
                file = null;
                break;
            }
            File fileA = hVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(hVar.f22617a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f50830a = 2;
        } else {
            this.f50831b = file;
            this.f50830a = 1;
        }
    }

    public final b b(File file) {
        int i11 = f.f22614a[((j) this.f22616d.f22620c).ordinal()];
        if (i11 == 1) {
            return new e(file);
        }
        if (i11 == 2) {
            return new c(file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
