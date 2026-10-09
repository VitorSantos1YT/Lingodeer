package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaep {
    public static String a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb2.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb2.append("-");
                sb2.append(country);
            }
        }
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            String language2 = locale2.getLanguage();
            if (language2 != null) {
                sb2.append(language2);
                String country2 = locale2.getCountry();
                if (country2 != null) {
                    sb2.append("-");
                    sb2.append(country2);
                }
            }
        }
        return sb2.toString();
    }
}
