package camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Extended presenter's lifecycle methods for more complex presenters
 */
public interface PresenterLifecycle extends PresenterShortLifecycle {

    void onSaveInstanceState(@NonNull Bundle outState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onActivityResult(int requestCode, int resultCode, Intent data);
}
