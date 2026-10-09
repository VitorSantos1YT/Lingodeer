package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class StringResourceValueReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f8953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8954b;

    public StringResourceValueReader(Context context) {
        Preconditions.g(context);
        Resources resources = context.getResources();
        this.f8953a = resources;
        this.f8954b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        Resources resources = this.f8953a;
        int identifier = resources.getIdentifier(str, "string", this.f8954b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
