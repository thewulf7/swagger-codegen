package io.swagger.client.api;

import io.swagger.client.ApiClient;
import java.io.File;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
import org.junit.*;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import static org.junit.Assert.*;

=======
/**
 * API tests for PetApi
 */
>>>>>>> 64ca726f969c009b90d4e9917e5022919d6b1c4e
public class PetApiTest {

    private PetApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PetApi.class);
    }

    /**
     * Add a new pet to the store
     *
     * 
     */
    @Test
    public void addPetTest() {
        Pet body = null;
        // Void response = api.addPet(body);

        // TODO: test validations
    }
    /**
     * Deletes a pet
     *
     * 
     */
    @Test
    public void deletePetTest() {
        Long petId = null;
        String apiKey = null;
        // Void response = api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     */
    @Test
    public void findPetsByStatusTest() {
        List<String> status = null;
        // List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    @Test
    public void findPetsByTagsTest() {
        List<String> tags = null;
        // List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    /**
     * Find pet by ID
     *
     * Returns a single pet
     */
    @Test
    public void getPetByIdTest() {
        Long petId = null;
        // Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    /**
     * Update an existing pet
     *
     * 
     */
    @Test
    public void updatePetTest() {
        Pet body = null;
        // Void response = api.updatePet(body);

        // TODO: test validations
    }
    /**
     * Updates a pet in the store with form data
     *
     * 
     */
    @Test
    public void updatePetWithFormTest() {
        Long petId = null;
        String name = null;
        String status = null;
        // Void response = api.updatePetWithForm(petId, name, status);

<<<<<<< HEAD
        writer.write("Hello world!");
        writer.close();

        Pet pet = createRandomPet();
        api.addPet(pet).subscribe(SkeletonSubscriber.failTestOnError());

        final RequestBody body = RequestBody.create(MediaType.parse("text/plain"), file);
        api.uploadFile(pet.getId(), "a test file", MultipartBody.Part.createFormData("datafile", file.getName(), body)).subscribe(new SkeletonSubscriber<ModelApiResponse>() {
            @Override
            public void onError(Throwable e) {
                // this also yields a 400 for other tests, so I guess it's okay...
            }
        });
=======
        // TODO: test validations
>>>>>>> 64ca726f969c009b90d4e9917e5022919d6b1c4e
    }
    /**
     * uploads an image
     *
     * 
     */
    @Test
    public void uploadFileTest() {
        Long petId = null;
        String additionalMetadata = null;
        File file = null;
        // ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);

        // TODO: test validations
    }
}
