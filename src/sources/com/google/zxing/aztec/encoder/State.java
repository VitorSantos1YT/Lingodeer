package com.google.zxing.aztec.encoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class State {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final State f21471e = new State(Token.f21476b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Token f21473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21475d;

    public State(Token token, int i11, int i12, int i13) {
        this.f21473b = token;
        this.f21472a = i11;
        this.f21474c = i12;
        this.f21475d = i13;
    }

    public final State a(int i11) {
        int i12;
        Token simpleToken = this.f21473b;
        int i13 = this.f21472a;
        int i14 = this.f21475d;
        if (i13 == 4 || i13 == 2) {
            int[] iArr = HighLevelEncoder.f21466b[i13];
            i13 = 0;
            int i15 = iArr[0];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            simpleToken.getClass();
            i14 += i17;
            simpleToken = new SimpleToken(simpleToken, i16, i17);
        }
        int i18 = this.f21474c;
        if (i18 == 0 || i18 == 31) {
            i12 = 18;
        } else {
            i12 = i18 == 62 ? 9 : 8;
        }
        int i19 = i18 + 1;
        State state = new State(simpleToken, i13, i19, i14 + i12);
        return i19 == 2078 ? state.b(i11 + 1) : state;
    }

    public final State b(int i11) {
        int i12 = this.f21474c;
        if (i12 == 0) {
            return this;
        }
        Token token = this.f21473b;
        token.getClass();
        return new State(new BinaryShiftToken(token, i11 - i12, i12), this.f21472a, 0, this.f21475d);
    }

    public final boolean c(State state) {
        int i11;
        int i12 = this.f21475d + (HighLevelEncoder.f21466b[this.f21472a][state.f21472a] >> 16);
        int i13 = state.f21474c;
        if (i13 > 0 && ((i11 = this.f21474c) == 0 || i11 > i13)) {
            i12 += 10;
        }
        return i12 <= state.f21475d;
    }

    public final State d(int i11, int i12) {
        int i13 = this.f21475d;
        Token simpleToken = this.f21473b;
        int i14 = this.f21472a;
        if (i11 != i14) {
            int i15 = HighLevelEncoder.f21466b[i14][i11];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            simpleToken.getClass();
            i13 += i17;
            simpleToken = new SimpleToken(simpleToken, i16, i17);
        }
        int i18 = i11 == 2 ? 4 : 5;
        simpleToken.getClass();
        return new State(new SimpleToken(simpleToken, i12, i18), i11, 0, i13 + i18);
    }

    public final State e(int i11, int i12) {
        int i13 = this.f21472a;
        int i14 = i13 == 2 ? 4 : 5;
        int i15 = HighLevelEncoder.f21468d[i13][i11];
        Token token = this.f21473b;
        token.getClass();
        return new State(new SimpleToken(new SimpleToken(token, i15, i14), i12, 5), i13, 0, this.f21475d + i14 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f21465a[this.f21472a], Integer.valueOf(this.f21475d), Integer.valueOf(this.f21474c));
    }
}
