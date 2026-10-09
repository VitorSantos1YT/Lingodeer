package com.lingo.lingoskill.http.service;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.lingo.lingoskill.http.object.NewsFeed;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o20.t0;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21886a = new c();

    @Override // tx.d
    public final Object apply(Object obj) {
        t0 t0Var = (t0) obj;
        ArrayList arrayListN = com.google.android.material.datepicker.d.n(t0Var, "s");
        String str = (String) t0Var.f44599b;
        arrayListN.addAll((Collection) new Gson().fromJson(JsonParser.parseString(str != null ? x.q0(str, "}{", "},{") : BuildConfig.VERSION_NAME).getAsJsonArray().toString(), new TypeToken<List<? extends NewsFeed>>() { // from class: com.lingo.lingoskill.http.service.NewsFeedDataService$newsfeed$1$type$1
        }.getType()));
        return arrayListN;
    }
}
