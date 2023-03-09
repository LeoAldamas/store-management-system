package leoaldamas.dev.storemanagementsystem.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.*;

public class JsonMapper {

    private final ObjectMapper jsonMapper;
    private JsonNode root;
    private Path path;
    private BufferedReader reader;
    private Map<String, JsonNode> data;

    public JsonMapper(String path) {
        this.jsonMapper = new ObjectMapper();
        // Return a Path by converting a path string.
        this.path = Path.of(path);
        this.data = new HashMap<>();
    }

    public void init() {
        try {
            // Opens a file to reading, returning a Buffered-Reader.
            this.reader = Files.newBufferedReader(path);

            // Our Json can be parsed into a JsonNode object
            // and used to retrieve data from a specific node.
            this.root = jsonMapper.readTree(reader);

            // Get all fields from a JsonNode and iterate.
            getJsonFields();
        } catch (IOException e) {
            throw new RuntimeException("File not found: " + path);
        }
    }

    private void getJsonFields() {
        if (root.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = root.fields();

            // Check if the iterator has more elements.
            while (fields.hasNext()) {

                // Returns the next element in the iteration.
                Map.Entry<String, JsonNode> field = fields.next();

                // Fill the map with the key (field name) and
                // the value (data).
                data.put(field.getKey(), field.getValue());
            }
        }
    }

    public Map<String, JsonNode> getData() {
        return data;
    }
}
