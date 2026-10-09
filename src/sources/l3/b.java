package l3;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f39712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f39713b;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f39712a = charSequence;
        this.f39713b = textPaint;
    }

    @Override // android.support.v4.media.session.a
    public final int E(int i11) {
        CharSequence charSequence = this.f39712a;
        return this.f39713b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 0);
    }

    @Override // android.support.v4.media.session.a
    public final int F(int i11) {
        CharSequence charSequence = this.f39712a;
        return this.f39713b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i11, 2);
    }
}
