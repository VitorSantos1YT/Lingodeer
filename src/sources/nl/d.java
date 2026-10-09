package nl;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43846a = 0;

    static {
        com.bumptech.glide.d.v(new ju.d(26));
        com.bumptech.glide.d.v(new ju.d(27));
    }

    public static FirebaseDatabase a(String str) {
        if (str != null) {
            return FirebaseDatabase.b(FirebaseApp.f("USER-INFO"), str);
        }
        FirebaseApp firebaseAppF = FirebaseApp.f("USER-INFO");
        firebaseAppF.b();
        FirebaseOptions firebaseOptions = firebaseAppF.f17716c;
        String string = firebaseOptions.f17733c;
        String str2 = firebaseOptions.f17737g;
        if (string == null) {
            firebaseAppF.b();
            if (str2 == null) {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
            StringBuilder sb2 = new StringBuilder("https://");
            firebaseAppF.b();
            sb2.append(str2);
            sb2.append("-default-rtdb.firebaseio.com");
            string = sb2.toString();
        }
        return FirebaseDatabase.b(firebaseAppF, string);
    }
}
