package l;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static v4.e b(Configuration configuration) {
        return v4.e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(v4.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f53512a.f53513a.toLanguageTags()));
    }

    public static void d(Configuration configuration, v4.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f53512a.f53513a.toLanguageTags()));
    }
}
