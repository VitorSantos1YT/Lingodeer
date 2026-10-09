package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckProviderFactory;
import com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PlayIntegrityAppCheckProviderFactory implements AppCheckProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PlayIntegrityAppCheckProviderFactory f17848a = new PlayIntegrityAppCheckProviderFactory();

    @Override // com.google.firebase.appcheck.AppCheckProviderFactory
    public final AppCheckProvider a(FirebaseApp firebaseApp) {
        return (AppCheckProvider) firebaseApp.c(PlayIntegrityAppCheckProvider.class);
    }
}
