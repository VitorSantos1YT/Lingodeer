package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class FuturesGetChecked {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17652a = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface GetCheckedTypeValidator {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class GetCheckedTypeValidatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class WeakSetValidator implements GetCheckedTypeValidator {
            private static final /* synthetic */ WeakSetValidator[] $VALUES;
            public static final WeakSetValidator INSTANCE;
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses;

            static {
                WeakSetValidator weakSetValidator = new WeakSetValidator("INSTANCE", 0);
                INSTANCE = weakSetValidator;
                $VALUES = new WeakSetValidator[]{weakSetValidator};
                validClasses = new CopyOnWriteArraySet();
            }

            public static WeakSetValidator valueOf(String str) {
                return (WeakSetValidator) Enum.valueOf(WeakSetValidator.class, str);
            }

            public static WeakSetValidator[] values() {
                return (WeakSetValidator[]) $VALUES.clone();
            }
        }

        static {
            int i11 = FuturesGetChecked.f17652a;
            WeakSetValidator weakSetValidator = WeakSetValidator.INSTANCE;
        }
    }

    static {
        final int i11 = 0;
        final int i12 = 1;
        Ordering orderingG = Ordering.c().f(new Function() { // from class: com.google.common.util.concurrent.g
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                switch (i11) {
                    case 0:
                        int i13 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i14 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i15 = FuturesGetChecked.f17652a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        }).a(Ordering.c().f(new Function() { // from class: com.google.common.util.concurrent.g
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                switch (i12) {
                    case 0:
                        int i13 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i14 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i15 = FuturesGetChecked.f17652a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        })).g();
        final int i13 = 2;
        orderingG.f(new Function() { // from class: com.google.common.util.concurrent.g
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                switch (i13) {
                    case 0:
                        int i14 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i15 = FuturesGetChecked.f17652a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i16 = FuturesGetChecked.f17652a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        });
    }

    private FuturesGetChecked() {
    }
}
