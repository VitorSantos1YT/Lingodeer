package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import bq.u;
import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ks.d;
import qy.h;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class AchievementLanguage implements Parcelable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22279id;
    private final boolean isActive;
    private final d language;
    private final float progress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AchievementLanguage> CREATOR = new Creator();
    private static final h[] $childSerializers = {null, com.bumptech.glide.d.u(j.PUBLICATION, new u(21)), null, null};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return AchievementLanguage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<AchievementLanguage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLanguage createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new AchievementLanguage(parcel.readString(), d.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLanguage[] newArray(int i11) {
            return new AchievementLanguage[i11];
        }
    }

    public /* synthetic */ AchievementLanguage(int i11, String str, d dVar, boolean z11, float f5, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, AchievementLanguage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f22279id = str;
        this.language = dVar;
        this.isActive = z11;
        this.progress = f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return d1.f("com.lingodeer.common.utils.LearnLanguage", d.values());
    }

    public static /* synthetic */ AchievementLanguage copy$default(AchievementLanguage achievementLanguage, String str, d dVar, boolean z11, float f5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = achievementLanguage.f22279id;
        }
        if ((i11 & 2) != 0) {
            dVar = achievementLanguage.language;
        }
        if ((i11 & 4) != 0) {
            z11 = achievementLanguage.isActive;
        }
        if ((i11 & 8) != 0) {
            f5 = achievementLanguage.progress;
        }
        return achievementLanguage.copy(str, dVar, z11, f5);
    }

    public static final /* synthetic */ void write$Self$data_release(AchievementLanguage achievementLanguage, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.w(gVar, 0, achievementLanguage.f22279id);
        bVar.A(gVar, 1, (a) hVarArr[1].getValue(), achievementLanguage.language);
        bVar.B(gVar, 2, achievementLanguage.isActive);
        bVar.E(gVar, 3, achievementLanguage.progress);
    }

    public final String component1() {
        return this.f22279id;
    }

    public final d component2() {
        return this.language;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final float component4() {
        return this.progress;
    }

    public final AchievementLanguage copy(String id2, d language, boolean z11, float f5) {
        m.f(id2, "id");
        m.f(language, "language");
        return new AchievementLanguage(id2, language, z11, f5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AchievementLanguage)) {
            return false;
        }
        AchievementLanguage achievementLanguage = (AchievementLanguage) obj;
        return m.a(this.f22279id, achievementLanguage.f22279id) && this.language == achievementLanguage.language && this.isActive == achievementLanguage.isActive && Float.compare(this.progress, achievementLanguage.progress) == 0;
    }

    public final String getId() {
        return this.f22279id;
    }

    public final d getLanguage() {
        return this.language;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Float.hashCode(this.progress) + defpackage.e.e((this.language.hashCode() + (this.f22279id.hashCode() * 31)) * 31, 31, this.isActive);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "AchievementLanguage(id=" + this.f22279id + ", language=" + this.language + ", isActive=" + this.isActive + ", progress=" + this.progress + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22279id);
        dest.writeString(this.language.name());
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeFloat(this.progress);
    }

    public AchievementLanguage(String id2, d language, boolean z11, float f5) {
        m.f(id2, "id");
        m.f(language, "language");
        this.f22279id = id2;
        this.language = language;
        this.isActive = z11;
        this.progress = f5;
    }
}
