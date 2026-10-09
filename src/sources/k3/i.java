package k3;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f37871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37873c = 0;

    public i(CharSequence charSequence, int i11) {
        this.f37871a = charSequence;
        this.f37872b = i11;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i11 = this.f37873c;
        if (i11 == this.f37872b) {
            return (char) 65535;
        }
        return this.f37871a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f37873c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f37872b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f37873c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i11 = this.f37872b;
        if (i11 == 0) {
            this.f37873c = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f37873c = i12;
        return this.f37871a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i11 = this.f37873c + 1;
        this.f37873c = i11;
        int i12 = this.f37872b;
        if (i11 < i12) {
            return this.f37871a.charAt(i11);
        }
        this.f37873c = i12;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i11 = this.f37873c;
        if (i11 <= 0) {
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f37873c = i12;
        return this.f37871a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i11) {
        if (i11 > this.f37872b || i11 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f37873c = i11;
        return current();
    }
}
