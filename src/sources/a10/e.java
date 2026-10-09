package a10;

import java.util.Objects;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f290b;

    public e(CharSequence charSequence, y yVar) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f289a = charSequence;
        this.f290b = yVar;
    }

    public final e a(int i11, int i12) {
        int i13;
        CharSequence charSequenceSubSequence = this.f289a.subSequence(i11, i12);
        y yVar = this.f290b;
        return new e(charSequenceSubSequence, (yVar == null || (i13 = i12 - i11) == 0) ? null : new y(yVar.f58453a, yVar.f58454b + i11, yVar.f58455c + i11, i13));
    }
}
