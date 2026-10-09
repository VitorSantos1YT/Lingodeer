package com.google.firebase.auth.internal;

import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzm {
    public static zzaij a(AuthCredential authCredential, String str) {
        Preconditions.g(authCredential);
        if (authCredential instanceof GoogleAuthCredential) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            Parcelable.Creator<GoogleAuthCredential> creator = GoogleAuthCredential.CREATOR;
            return new zzaij(googleAuthCredential.f17903a, googleAuthCredential.f17904b, "google.com", null, null, str, null, null);
        }
        if (authCredential instanceof FacebookAuthCredential) {
            Parcelable.Creator<FacebookAuthCredential> creator2 = FacebookAuthCredential.CREATOR;
            return new zzaij(null, ((FacebookAuthCredential) authCredential).f17877a, "facebook.com", null, null, str, null, null);
        }
        if (authCredential instanceof TwitterAuthCredential) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            Parcelable.Creator<TwitterAuthCredential> creator3 = TwitterAuthCredential.CREATOR;
            return new zzaij(null, twitterAuthCredential.f17920a, "twitter.com", twitterAuthCredential.f17921b, null, str, null, null);
        }
        if (authCredential instanceof GithubAuthCredential) {
            Parcelable.Creator<GithubAuthCredential> creator4 = GithubAuthCredential.CREATOR;
            return new zzaij(null, ((GithubAuthCredential) authCredential).f17902a, "github.com", null, null, str, null, null);
        }
        if (authCredential instanceof PlayGamesAuthCredential) {
            Parcelable.Creator<PlayGamesAuthCredential> creator5 = PlayGamesAuthCredential.CREATOR;
            return new zzaij(null, null, "playgames.google.com", null, ((PlayGamesAuthCredential) authCredential).f17915a, str, null, null);
        }
        if (!(authCredential instanceof com.google.firebase.auth.zzc)) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        com.google.firebase.auth.zzc zzcVar = (com.google.firebase.auth.zzc) authCredential;
        Parcelable.Creator<com.google.firebase.auth.zzc> creator6 = com.google.firebase.auth.zzc.CREATOR;
        zzaij zzaijVar = zzcVar.f18072d;
        return zzaijVar != null ? zzaijVar : new zzaij(zzcVar.f18070b, zzcVar.f18071c, zzcVar.f18069a, zzcVar.f18074f, null, str, zzcVar.f18073e, zzcVar.f18075t);
    }
}
