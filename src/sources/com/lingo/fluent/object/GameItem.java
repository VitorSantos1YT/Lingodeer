package com.lingo.fluent.object;

import defpackage.e;
import ep.a;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GameItem {
    public static final int $stable = 0;
    private final int bgRes;
    private final int color;
    private final int iconRes;
    private final int name;
    private final int pbColor;
    private final long type;

    public GameItem(int i11, int i12, int i13, int i14, int i15, long j11) {
        this.iconRes = i11;
        this.bgRes = i12;
        this.color = i13;
        this.pbColor = i14;
        this.name = i15;
        this.type = j11;
    }

    public static /* synthetic */ GameItem copy$default(GameItem gameItem, int i11, int i12, int i13, int i14, int i15, long j11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = gameItem.iconRes;
        }
        if ((i16 & 2) != 0) {
            i12 = gameItem.bgRes;
        }
        if ((i16 & 4) != 0) {
            i13 = gameItem.color;
        }
        if ((i16 & 8) != 0) {
            i14 = gameItem.pbColor;
        }
        if ((i16 & 16) != 0) {
            i15 = gameItem.name;
        }
        if ((i16 & 32) != 0) {
            j11 = gameItem.type;
        }
        long j12 = j11;
        int i17 = i15;
        int i18 = i13;
        return gameItem.copy(i11, i12, i18, i14, i17, j12);
    }

    public final int component1() {
        return this.iconRes;
    }

    public final int component2() {
        return this.bgRes;
    }

    public final int component3() {
        return this.color;
    }

    public final int component4() {
        return this.pbColor;
    }

    public final int component5() {
        return this.name;
    }

    public final long component6() {
        return this.type;
    }

    public final GameItem copy(int i11, int i12, int i13, int i14, int i15, long j11) {
        return new GameItem(i11, i12, i13, i14, i15, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameItem)) {
            return false;
        }
        GameItem gameItem = (GameItem) obj;
        return this.iconRes == gameItem.iconRes && this.bgRes == gameItem.bgRes && this.color == gameItem.color && this.pbColor == gameItem.pbColor && this.name == gameItem.name && this.type == gameItem.type;
    }

    public final int getBgRes() {
        return this.bgRes;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getName() {
        return this.name;
    }

    public final int getPbColor() {
        return this.pbColor;
    }

    public final long getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.type) + e.b(this.name, e.b(this.pbColor, e.b(this.color, e.b(this.bgRes, Integer.hashCode(this.iconRes) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        int i11 = this.iconRes;
        int i12 = this.bgRes;
        int i13 = this.color;
        int i14 = this.pbColor;
        int i15 = this.name;
        long j11 = this.type;
        StringBuilder sbK = c.k("GameItem(iconRes=", i11, ", bgRes=", i12, ", color=");
        a.v(i13, i14, ", pbColor=", ", name=", sbK);
        sbK.append(i15);
        sbK.append(", type=");
        sbK.append(j11);
        sbK.append(")");
        return sbK.toString();
    }
}
