package h00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f29931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f29935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f29937h;

    public j(boolean z11, boolean z12, boolean z13, String prettyPrintIndent, boolean z14, String classDiscriminator, boolean z15, a classDiscriminatorMode) {
        kotlin.jvm.internal.m.f(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.m.f(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.m.f(classDiscriminatorMode, "classDiscriminatorMode");
        this.f29930a = z11;
        this.f29931b = z12;
        this.f29932c = z13;
        this.f29933d = prettyPrintIndent;
        this.f29934e = z14;
        this.f29935f = classDiscriminator;
        this.f29936g = z15;
        this.f29937h = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f29930a + ", isLenient=" + this.f29931b + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f29932c + ", prettyPrintIndent='" + this.f29933d + "', coerceInputValues=" + this.f29934e + ", useArrayPolymorphism=false, classDiscriminator='" + this.f29935f + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f29936g + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f29937h + ')';
    }
}
