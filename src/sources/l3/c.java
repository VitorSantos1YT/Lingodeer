package l3;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakIterator f39714a;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f39714a = characterInstance;
    }

    @Override // android.support.v4.media.session.a
    public final int E(int i11) {
        return this.f39714a.following(i11);
    }

    @Override // android.support.v4.media.session.a
    public final int F(int i11) {
        return this.f39714a.preceding(i11);
    }
}
