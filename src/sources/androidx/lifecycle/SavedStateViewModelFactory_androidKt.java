package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactory_androidKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = o.L(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = o.K(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        m.f(modelClass, "modelClass");
        m.f(signature, "signature");
        e00.i iVarA = l.a(modelClass.getConstructors());
        while (iVarA.hasNext()) {
            Constructor<T> constructor = (Constructor) iVarA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            m.e(parameterTypes, "getParameterTypes(...)");
            List listK0 = ry.l.k0(parameterTypes);
            if (signature.equals(listK0)) {
                return constructor;
            }
            if (signature.size() == listK0.size() && listK0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        m.f(modelClass, "modelClass");
        m.f(constructor, "constructor");
        m.f(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + modelClass, e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e11.getCause());
        }
    }
}
