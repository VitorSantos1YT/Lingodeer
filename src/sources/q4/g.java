package q4;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f47442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f47443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47444c;

    public g(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f47442a = colorStateList;
        this.f47443b = configuration;
        this.f47444c = theme == null ? 0 : theme.hashCode();
    }
}
